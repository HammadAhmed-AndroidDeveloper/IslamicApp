package com.ne.muslimprayers.qiblafinder.data.viewmodels

import android.util.Log
import android.view.View
import android.widget.ProgressBar
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.day
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.hour
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.month
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.year
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository
import com.ne.muslimprayers.qiblafinder.repo.States
import com.ne.muslimprayers.qiblafinder.utils.Utils.convert
import com.ne.muslimprayers.qiblafinder.utils.Utils.timings
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor(
    private val repository: PrayerRepository
) : ViewModel() {

    var calendarData = MutableStateFlow(IslamicCalendar.EMPTY)
    private val calednarLiveData = MutableLiveData<IslamicCalendar>()

    private var currentSalahScheduleModelData = MutableLiveData<SalahScheduleModelData>()
    private val css = MutableLiveData<SalahScheduleModelData>()

    private var salahTimings = MutableStateFlow(SalahTime.EMPTY)
    private var currentSalahTime = SalahTime.EMPTY

    fun getCalendar(lat: Double, long: Double, date: Timestamp, pb: ProgressBar) = viewModelScope.launch {
        repository.getCalendar(lat, long, date.month, date.year).collect {
            when (it) {
                is States.Loading -> {
                    pb.visibility = View.VISIBLE
                    Log.d("TAG", "getPrayerSchedule: loading")
                }

                is States.Success -> {
                    pb.visibility = View.GONE
                    it.data.find { sc ->
                        sc.georgianDate.day == if (date.hour > 20) date.day + 1 else date.day
                    }?.let { schedule ->
                       onSuccess(schedule)
                    }
                }

                is States.Failed -> {
                    pb.visibility = View.VISIBLE
                    Log.d("TAG", "getPrayerSchedule: failed = ${it.message}")
                }
            }
        }
    }

    private fun onSuccess(schedule: IslamicCalendar) {
        viewModelScope.launch {
            calendarData.emit(schedule)
            calednarLiveData.value = schedule
            currentSalahScheduleModelData = css
        }
        getPrayersData(schedule.salahTime)
        viewModelScope.launch {
            salahTimings.emit(currentSalahTime)
        }
    }


    private fun getPrayersData(salahTime: SalahTime) = viewModelScope.launch {
        repository.getPrayerReminder().collect {
            if (it.isEmpty()) repository.addReminder(PrayerReminder.EMPTY)
            else updatePrayerReminder(salahTime, it)
        }
    }

    private fun updatePrayerReminder(
        salahTime: SalahTime,
        data: List<PrayerReminder>,
    ) {
        val model = salahTime.convert()
        Log.e("sizeOf", "updateReminder: ${data.size}")
        if (model.isNotEmpty()) {
            for (i in 0..4) {
                model[data[i].index].isAlarmOn = data[i].isReminded
            }
            currentSalahTime = model.timings()
        }
    }
}