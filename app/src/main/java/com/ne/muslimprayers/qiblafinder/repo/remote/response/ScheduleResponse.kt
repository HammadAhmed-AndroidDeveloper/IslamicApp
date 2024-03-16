package com.ne.muslimprayers.qiblafinder.repo.remote.response
import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ScheduleResponse(

    @SerializedName("date")
    val dateResponse: DateResponse? = null,

    @SerializedName("meta")
    val metaResponse: MetaResponse? = null,

    @SerializedName("timings")
    val timingResponse: TimingResponse? = null
)

@Keep
data class MetaResponse(

    @SerializedName("timezone")
    val timezone: String? = null,

    @SerializedName("latitude")
    val latitude: Double? = null,

    @SerializedName("longitude")
    val longitude: Double? = null,
)

@Keep
data class TimingResponse(

    @SerializedName("Sunset")
    val sunset: String? = null,

    @SerializedName("Asr")
    val asr: String? = null,

    @SerializedName("Isha")
    val isha: String? = null,

    @SerializedName("Fajr")
    val fajr: String? = null,

    @SerializedName("Dhuhr")
    val dhuhr: String? = null,

    @SerializedName("Maghrib")
    val maghrib: String? = null,

    @SerializedName("Sunrise")
    val sunrise: String? = null,

    @SerializedName("Midnight")
    val midnight: String? = null,

    @SerializedName("Imsak")
    val imsak: String? = null
)

@Keep
data class DateResponse(

    @SerializedName("readable")
    val readable: String? = null,

    @SerializedName("hijri")
    val hijri: CalendarFormatResponse? = null,

    @SerializedName("gregorian")
    val gregorian: CalendarFormatResponse? = null,

    @SerializedName("timestamp")
    val timestamp: String? = null
)
