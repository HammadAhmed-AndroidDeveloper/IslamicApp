package com.ne.muslimprayers.qiblafinder.ui.fragments

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import com.google.android.gms.location.LocationServices
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.R
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel
import com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel
import com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel
import com.ne.muslimprayers.qiblafinder.databinding.FragmentHomeBinding
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.montYear
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.stringFormat
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.timeStamp
import com.ne.muslimprayers.qiblafinder.utils.Utils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private val homeViewModel: PrayerTimingViewModel by viewModels()
    private val scope = lifecycleScope
    private val scope1 = lifecycleScope
    private lateinit var binding: FragmentHomeBinding
    private val calendarViewModel: CalendarViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            if (Utils.isLocationEnabled(requireActivity())) {
                fusedLocationClient.lastLocation.addOnSuccessListener {
                    homeViewModel.getPrayerTimings(
                        it.latitude,
                        it.longitude,
                        Timestamp.now(),
                        binding.pb
                    )
                    calendarViewModel.getCalendar(
                        it.latitude,
                        it.longitude,
                        Timestamp.now(),
                        binding.pb
                    )
                }

                scope.launch {
                    calendarViewModel.calendarData.collect { value ->
                        populateCurrentSchedule(value)
                    }
                }

                scope1.launch {
                    homeViewModel.salahFlow.collect(::getPrayerTimings)
                }
            } else {
                Utils.showLocationErrorDialog(requireActivity())
            }

        }

        binding.qiblaFinder.setOnClickListener {
            navController.navigate(R.id.compassFragment)
        }

        binding.ramadanCalendar.setOnClickListener {
            navController.navigate(R.id.calendarFragment)
        }

        binding.azanTimings.setOnClickListener {
            navController.navigate(R.id.prayerTimingsFragment)
        }

        binding.alarm.setOnClickListener {
            navController.navigate(R.id.prayerAlarmFragment)
        }
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    private fun populateCurrentSchedule(schedule: IslamicCalendar) {
        val data = if (schedule.hijriDate.holidays.isEmpty()) mutableListOf("No Event")
        else schedule.hijriDate.holidays.toMutableList()
        with(binding) {
            islamicDateTv.text = buildString {
                schedule.hijriDate.let {
                    append("${it.day} ${it.monthDesignation} ${it.year} ${it.yearDesignation}")
                }
            }
            Log.d("comingData", "populateCurrentSchedule: $data")
//            tvHoliday.text = data[0]
            schedule.georgianDate.let {
                Log.d("populateCurrentSchedule", "populateCurrentSchedule: $it")
                normalDateTv.text = schedule.georgianDate.day.toString() + " " + TimeUnits.getCalendar(
                    it.year,
                    it.month - 1,
                    it.day
                ).time.stringFormat.timeStamp.montYear
            }
        }
    }

    private fun getPrayerTimings(pd: SalahDataModel) {
        with(binding) {
            val data_: ArrayList<SalahModel> = ArrayList()
            data_.clear()
            val ts = pd.salahTime
            val nearestSchedule = Utils.getSalahScheduleBy(ts, Timestamp.now())
            data_.add(ts.fajr)
            data_.add(ts.dhuhr)
            data_.add(ts.asr)
            data_.add(ts.maghrib)
            data_.add(ts.isha)

            for (i in 0 until data_.size) {
                try {
                    if (nearestSchedule.time == data_[i].time) {
                        currentPrayerTv.text = Utils.getScheduleName(ts, data_[i])
                        currentPrayerTimeTv.text = data_[i].time
                        upComingPrayerTv.text = Utils.getScheduleName(ts, data_[i + 1])
                        upComingPrayerTimeTv.text = data_[i+1].time
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    upComingPrayerTv.text = Utils.getScheduleName(ts, data_[0])
                    upComingPrayerTimeTv.text = data_[0].time
                }
            }
        }
    }
}