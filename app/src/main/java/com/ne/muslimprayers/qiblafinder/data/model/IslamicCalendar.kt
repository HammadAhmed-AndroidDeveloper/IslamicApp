package com.ne.muslimprayers.qiblafinder.data.model

import com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse
import com.ne.muslimprayers.qiblafinder.utils.Utils

data class IslamicCalendar(
    val salahTime: SalahTime,
    val georgianDate: CalendarDataModel,
    val hijriDate: CalendarDataModel,
    val latLongTimeZoneModel: LatLongTimeZoneModel
) {
    companion object {
        val EMPTY = Utils.getCalendarData(ScheduleResponse())
    }
}