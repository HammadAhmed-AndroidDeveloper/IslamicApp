package com.ne.muslimprayers.qiblafinder.data.viewmodels

import android.content.Context
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime
import com.ne.muslimprayers.qiblafinder.data.model.hour
import com.ne.muslimprayers.qiblafinder.data.model.minutes
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository
import com.ne.muslimprayers.qiblafinder.repo.States
import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.day
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.hour
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.month
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.year
import com.ne.muslimprayers.qiblafinder.utils.Utils
import com.ne.muslimprayers.qiblafinder.utils.Utils.convert
import com.ne.muslimprayers.qiblafinder.utils.Utils.timings
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.Calendar
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class PrayerTimingViewModel @Inject constructor(
    private val repository: PrayerRepository,
    private val prayerAlarmService: PrayerAlarmService
) : ViewModel() {

    var salahFlow = MutableStateFlow(SalahDataModel.EMPTY)
    var salahLiveData = MutableLiveData<SalahDataModel>()

    private var currentSalahScheduleModelData = MutableLiveData<SalahScheduleModelData>()
    private val css = MutableLiveData<SalahScheduleModelData>()

    var salatimings = MutableStateFlow(SalahTime.EMPTY)

    private var currentSalahTime = SalahTime.EMPTY
    var newData = MutableLiveData("-")
    var newDataMetaData = MutableLiveData("-")
    private var cdt: CountDownTimer? = null


    fun getPrayerTimings(lat: Double, long: Double, date: Timestamp, pb: ProgressBar) =
        viewModelScope.launch {
            repository.getPrayerTimings(lat, long, date.month, date.year).collect {
                when (it) {
                    is States.Loading -> {
                        Log.d("getPrayerTimings", "getPrayerTimings: loading")
                        pb.visibility = View.VISIBLE
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
                        Log.d("getPrayerTimings", "getPrayerTimings: ${it.message}")
                        pb.visibility = View.VISIBLE
                    }
                }
            }
        }

    private fun onSuccess(schedule: SalahDataModel) {
        viewModelScope.launch {
            salahFlow.emit(schedule)
            salahLiveData.value = schedule
            currentSalahScheduleModelData = css
        }
        getPrayersAlaarms(schedule.salahTime)
        viewModelScope.launch {
            salatimings.emit(currentSalahTime)
        }
    }

    private fun getPrayersAlaarms(salahTime: SalahTime) = viewModelScope.launch {
        repository.getPrayerReminder().collect {
            if (it.isEmpty()) repository.addReminder(PrayerReminder.EMPTY)
            else updateAlarms(salahTime, it)
        }
    }

    private fun updateAlarms(
        salahTime: SalahTime,
        listOfReminder: List<PrayerReminder>
    ) {
        val listSchedule = salahTime.convert()
        if (listSchedule.isNotEmpty()) {
            for (i in 0..4) { // TODO listOfReminder
                listSchedule[listOfReminder[i].index].isAlarmOn = listOfReminder[i].isReminded
            }
            currentSalahTime = listSchedule.timings()
        }
    }

    fun setAlarm(
        context: Context,
        salahTime: SalahTime,
        prayerTime: String,
        isReminded: Boolean,
        position: Int
    ) = viewModelScope.launch {
        cdt?.onFinish()
        val prayerReminder = PrayerReminder(position, prayerTime, isReminded)
        if (isReminded) prayerAlarmService.setAlarm(context, prayerReminder)
        else prayerAlarmService.cancelAlarm(context, prayerReminder.index)
        viewModelScope.launch {
            repository.updateReminder(PrayerReminder(position, prayerTime, isReminded))
            getPrayersAlaarms(salahTime)
        }
    }

    fun getNewData(salahTime: SalahTime, salahModel: SalahModel) = viewModelScope.launch {
        val now = Timestamp.now()
        val diff: Long = Date(
            Calendar.getInstance().apply {
                set(
                    Calendar.DAY_OF_MONTH,
                    if (now.hour > salahTime.isha.time.hour) now.day + 1 else now.day
                )
                set(Calendar.HOUR_OF_DAY, salahModel.time.hour)
                set(Calendar.MINUTE, salahModel.time.minutes)
            }.time.time
        ).time - now.toDate().time
        cdt?.cancel()
        cdt = object : CountDownTimer(diff, 1000) {
            override fun onTick(progress: Long) {
                val seconds = progress / 1000
                val minutes = seconds / 60
                val hours = minutes / 60
                newData.postValue("${hours}h ${minutes - (hours * 60)}m ${seconds - (minutes * 60)}s")
                newDataMetaData.postValue(buildString {
                    append(" to ")
                    append(Utils.getScheduleName(salahTime, salahModel))
                })
            }

            override fun onFinish() {
                cdt?.cancel()
                newData.value = "Now"
                newDataMetaData.value = buildString {
                    append(" it's time to pray ")
                    append(Utils.getScheduleName(salahTime, salahModel))
                }
            }
        }.start()
    }
}