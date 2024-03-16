package com.ne.muslimprayers.qiblafinder.ui.fragments

import android.Manifest
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
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel
import com.ne.muslimprayers.qiblafinder.databinding.FragmentCalendarBinding
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.montYear
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.stringFormat
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.timeStamp
import com.ne.muslimprayers.qiblafinder.utils.Utils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CalendarFragment : Fragment() {

    private lateinit var binding: FragmentCalendarBinding
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private val homeViewModel: CalendarViewModel by viewModels()
    private val scope = lifecycleScope
    private var currentLat = 0.0
    private var currentLong = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalendarBinding.inflate(inflater, container, false)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

        if (Utils.isLocationEnabled(requireActivity())) {
            if (ActivityCompat.checkSelfPermission(
                    requireActivity(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    requireActivity(),
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                fusedLocationClient.lastLocation.addOnSuccessListener {
                    currentLat = it.latitude
                    currentLong = it.longitude
                    homeViewModel.getCalendar(
                        it.latitude,
                        it.longitude,
                        Timestamp.now(),
                        binding.pb
                    )
                }
                scope.launch {
                    homeViewModel.calendarData.collect { value ->
                        getCalendar(value)
                    }
                }
                binding.calendarView.setOnDateChangeListener { _, year, month, day ->
                    homeViewModel.getCalendar(
                        currentLat,
                        currentLong,
                        TimeUnits.getCalendar(year, month, day).time.stringFormat.timeStamp,
                        binding.pb
                    )
                }
            }
        } else {
            Utils.showLocationErrorDialog(requireActivity())
        }

        return binding.root
    }

    private fun getCalendar(schedule: IslamicCalendar) {
        val data = if (schedule.hijriDate.holidays.isEmpty()) mutableListOf("No Event")
        else schedule.hijriDate.holidays.toMutableList()
        with(binding) {
            tvDateIslamic.text = buildString {
                schedule.hijriDate.let {
                    append("${it.day} ${it.monthDesignation} ${it.year} ${it.yearDesignation}")
                }
            }
            Log.d("comingData", "populateCurrentSchedule: $data")
            tvHoliday.text = data[0]
            schedule.georgianDate.let {
                Log.d("populateCurrentSchedule", "populateCurrentSchedule: $it")
                tvDate.text = schedule.georgianDate.day.toString() + " " + TimeUnits.getCalendar(
                    it.year,
                    it.month - 1,
                    it.day
                ).time.stringFormat.timeStamp.montYear
            }
        }
    }
}