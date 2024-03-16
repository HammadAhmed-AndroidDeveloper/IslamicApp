package com.ne.muslimprayers.qiblafinder.repo.remote.response

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class PrayerScheduleResponse(

    @SerializedName("code")
    val code: Int? = null,

    @SerializedName("data")
    val data: List<ScheduleResponse>? = null,

    @SerializedName("status")
    val status: String? = null
)