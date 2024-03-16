package com.ne.muslimprayers.qiblafinder.interfaces

import com.ne.muslimprayers.qiblafinder.data.model.SalahModel


interface PrayerAlarmListener {
    fun setAlarm(position: Int, salahModel : SalahModel)
}