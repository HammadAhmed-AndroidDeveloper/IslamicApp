package com.ne.muslimprayers.qiblafinder.utils

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.R
import com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime
import com.ne.muslimprayers.qiblafinder.data.model.hour
import com.ne.muslimprayers.qiblafinder.data.model.minutes
import com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.hour
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.minutes


object Utils {
    fun getScheduleName(ts: SalahTime, time: SalahModel): String {
        return when (ts.convert().indexOf(time)) {
            0 -> "Fajr"
            1 -> "Dohar"
            2 -> "Asr"
            3 -> "Maghrib"
            4 -> "Isha"
            else -> "_"
        }
    }

    fun getSalahScheduleBy(ts: SalahTime, timestamp: Timestamp): SalahModel =
        ts.convert()
            .filter { it.time.hour >= timestamp.hour }
            .firstOrNull {
                if (it.time.hour == timestamp.hour) it.time.minutes >=
                        timestamp.minutes
                else it.time.hour >= timestamp.hour
            } ?: ts.convert().minByOrNull { it.time.hour } ?: SalahModel.EMPTY

    fun SalahTime.convert() = if (this.fajr.time != "_") listOf(
        this.fajr, this.dhuhr, this.asr, this.maghrib, this.isha,
    ) else listOf()

    fun List<SalahModel>.timings() =
        SalahTime(this[0], this[1], this[2], this[3], this[4])

    fun getAgenda(data: List<ScheduleResponse>): MutableList<SalahScheduleModelData> {
        val listOfSalahScheduleModelData = mutableListOf<SalahScheduleModelData>()
        for (i in data) {
            listOfSalahScheduleModelData.add(getAgenda(i))
        }
        return listOfSalahScheduleModelData
    }

    fun getCalendarData(data: List<ScheduleResponse>): MutableList<IslamicCalendar> {
        val listOfSchedule = mutableListOf<IslamicCalendar>()
        for (i in data) {
            listOfSchedule.add(getCalendarData(i))
        }
        return listOfSchedule
    }

    fun getAllPrayers(data: List<ScheduleResponse>): MutableList<SalahDataModel> {
        val listOfSchedule = mutableListOf<SalahDataModel>()
        for (i in data) {
            listOfSchedule.add(getPrayerData(i))
        }
        return listOfSchedule
    }

    fun getAgenda(response: ScheduleResponse): SalahScheduleModelData {
        return SalahScheduleModelData(
            georgianCDM = CalendarDataModel(
                day = (response.dateResponse?.gregorian?.day ?: "0").toInt(),
                month = response.dateResponse?.gregorian?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.gregorian?.monthResponse?.en ?: "",
                year = (response.dateResponse?.gregorian?.year ?: "0").toInt(),
                yearDesignation = "AD",
                weekday = response.dateResponse?.gregorian?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.gregorian?.date ?: "",
                holidays = response.dateResponse?.gregorian?.holidays ?: listOf()
            ),
            hijriCDM = CalendarDataModel(
                day = (response.dateResponse?.hijri?.day ?: "0").toInt(),
                month = response.dateResponse?.hijri?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.hijri?.monthResponse?.en ?: "",
                year = (response.dateResponse?.hijri?.year ?: "0").toInt(),
                yearDesignation = "AH",
                weekday = response.dateResponse?.hijri?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.hijri?.date ?: "",
                holidays = response.dateResponse?.hijri?.holidays ?: listOf()
            ),
            salahTime = SalahTime(
                fajr = SalahModel(response.timingResponse?.fajr ?: "-", false),
                dhuhr = SalahModel(response.timingResponse?.dhuhr ?: "-", false),
                asr = SalahModel(response.timingResponse?.asr ?: "-", false),
                maghrib = SalahModel(response.timingResponse?.maghrib ?: "-", false),
                isha = SalahModel(response.timingResponse?.isha ?: "-", false),
            ),
            latLongTimeZoneModel = LatLongTimeZoneModel(
                lat = response.metaResponse?.latitude ?: 0.0,
                lng = response.metaResponse?.longitude ?: 0.0,
                timeZone = response.metaResponse?.timezone ?: ""
            )
        )
    }

    fun getCalendarData(response: ScheduleResponse): IslamicCalendar {
        return IslamicCalendar(
            georgianDate = CalendarDataModel(
                day = (response.dateResponse?.gregorian?.day ?: "0").toInt(),
                month = response.dateResponse?.gregorian?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.gregorian?.monthResponse?.en ?: "",
                year = (response.dateResponse?.gregorian?.year ?: "0").toInt(),
                yearDesignation = "AD",
                weekday = response.dateResponse?.gregorian?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.gregorian?.date ?: "",
                holidays = response.dateResponse?.gregorian?.holidays ?: listOf()
            ),
            hijriDate = CalendarDataModel(
                day = (response.dateResponse?.hijri?.day ?: "0").toInt(),
                month = response.dateResponse?.hijri?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.hijri?.monthResponse?.en ?: "",
                year = (response.dateResponse?.hijri?.year ?: "0").toInt(),
                yearDesignation = "AH",
                weekday = response.dateResponse?.hijri?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.hijri?.date ?: "",
                holidays = response.dateResponse?.hijri?.holidays ?: listOf()
            ),
            salahTime = SalahTime(
                fajr = SalahModel(response.timingResponse?.fajr ?: "-", false),
                dhuhr = SalahModel(response.timingResponse?.dhuhr ?: "-", false),
                asr = SalahModel(response.timingResponse?.asr ?: "-", false),
                maghrib = SalahModel(response.timingResponse?.maghrib ?: "-", false),
                isha = SalahModel(response.timingResponse?.isha ?: "-", false),
            ),
            latLongTimeZoneModel = LatLongTimeZoneModel(
                lat = response.metaResponse?.latitude ?: 0.0,
                lng = response.metaResponse?.longitude ?: 0.0,
                timeZone = response.metaResponse?.timezone ?: ""
            )
        )
    }

    fun getPrayerData(response: ScheduleResponse): SalahDataModel {
        return SalahDataModel(
            georgianDate = CalendarDataModel(
                day = (response.dateResponse?.gregorian?.day ?: "0").toInt(),
                month = response.dateResponse?.gregorian?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.gregorian?.monthResponse?.en ?: "",
                year = (response.dateResponse?.gregorian?.year ?: "0").toInt(),
                yearDesignation = "AD",
                weekday = response.dateResponse?.gregorian?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.gregorian?.date ?: "",
                holidays = response.dateResponse?.gregorian?.holidays ?: listOf()
            ),
            hijriDate = CalendarDataModel(
                day = (response.dateResponse?.hijri?.day ?: "0").toInt(),
                month = response.dateResponse?.hijri?.monthResponse?.number ?: 0,
                monthDesignation = response.dateResponse?.hijri?.monthResponse?.en ?: "",
                year = (response.dateResponse?.hijri?.year ?: "0").toInt(),
                yearDesignation = "AH",
                weekday = response.dateResponse?.hijri?.weekdayResponse?.en ?: "",
                date = response.dateResponse?.hijri?.date ?: "",
                holidays = response.dateResponse?.hijri?.holidays ?: listOf()
            ),
            salahTime = SalahTime(
                fajr = SalahModel(response.timingResponse?.fajr ?: "-", false),
                dhuhr = SalahModel(response.timingResponse?.dhuhr ?: "-", false),
                asr = SalahModel(response.timingResponse?.asr ?: "-", false),
                maghrib = SalahModel(response.timingResponse?.maghrib ?: "-", false),
                isha = SalahModel(response.timingResponse?.isha ?: "-", false),
            ),
            latLongTimeZoneModel = LatLongTimeZoneModel(
                lat = response.metaResponse?.latitude ?: 0.0,
                lng = response.metaResponse?.longitude ?: 0.0,
                timeZone = response.metaResponse?.timezone ?: ""
            )
        )
    }

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo

        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    fun isLocationEnabled(context: Context): Boolean {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return if (locationManager != null) {
            val isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
            val isNetworkEnabled =
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
            isGpsEnabled || isNetworkEnabled
        } else {
            false
        }
    }

    fun showLocationErrorDialog(context: FragmentActivity) {
        val customDialog = Dialog(context)
        val dialogView: View = LayoutInflater.from(context)
            .inflate(R.layout.enable_location_dialog, null)
        customDialog.setContentView(dialogView)

        customDialog.findViewById<TextView>(R.id.allow).setOnClickListener {
            context.startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))
        }
        customDialog.findViewById<TextView>(R.id.leave).setOnClickListener {
            context.finishAffinity()
        }


        customDialog.show()
    }
}