package com.ne.muslimprayers.qiblafinder.data.model

import com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse
import com.ne.muslimprayers.qiblafinder.utils.Utils.getAgenda

data class SalahScheduleModelData(
    val hijriCDM: CalendarDataModel,
    val georgianCDM: CalendarDataModel,
    val salahTime: SalahTime,
    val latLongTimeZoneModel: LatLongTimeZoneModel
) {
    companion object {
        val initialValue = getAgenda(ScheduleResponse())
    }
}






