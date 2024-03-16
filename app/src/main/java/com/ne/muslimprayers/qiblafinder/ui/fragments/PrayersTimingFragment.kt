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
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.location.LocationServices
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.adapter.PrayerTimingsAdapter
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel
import com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel
import com.ne.muslimprayers.qiblafinder.databinding.FragmentPrayersTimingBinding
import com.ne.muslimprayers.qiblafinder.interfaces.PrayerAlarmListener
import com.ne.muslimprayers.qiblafinder.utils.Utils
import com.ne.muslimprayers.qiblafinder.utils.Utils.getSalahScheduleBy
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PrayersTimingFragment : Fragment() {
    private val homeViewModel: PrayerTimingViewModel by viewModels()
    private val scope = lifecycleScope
    private lateinit var adapter: PrayerTimingsAdapter

    private val data: ArrayList<SalahModel> = ArrayList()
    private lateinit var binding: FragmentPrayersTimingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentPrayersTimingBinding.inflate(inflater, container, false)

        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        if (ActivityCompat.checkSelfPermission(
                requireContext(), Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION
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
                }
                scope.launch { homeViewModel.salahFlow.collect(::getPrayers) }
            } else {
                Utils.showLocationErrorDialog(requireActivity())
            }
        }


        binding.prayersTimingRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
        }
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    private fun getPrayers(schedule: SalahDataModel) {
        Log.d("pps", "populateCurrentSchedule: $schedule")
        data.clear()
        val ts = schedule.salahTime
        data.add(ts.fajr)
        data.add(ts.dhuhr)
        data.add(ts.asr)
        data.add(ts.maghrib)
        data.add(ts.isha)

        adapter = PrayerTimingsAdapter(data, ts, false, object : PrayerAlarmListener {
            override fun setAlarm(position: Int, salahModel: SalahModel) {
                val prayerTime = getSalahScheduleBy(ts, Timestamp.now())
                if (prayerTime.time != "_") {
                    homeViewModel.newData.observe(requireActivity()) {
                        if (it == "_") {
                            homeViewModel.getNewData(ts, prayerTime)
                        }
                    }
                    salahModel.isAlarmOn = !salahModel.isAlarmOn

                    homeViewModel.setAlarm(
                        requireContext(), ts, salahModel.time, salahModel.isAlarmOn, position
                    )
                }
            }
        })
        binding.prayersTimingRv.adapter = adapter
    }
}