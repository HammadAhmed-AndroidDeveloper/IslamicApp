package com.ne.muslimprayers.qiblafinder.repo.remote.network

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName
import com.ne.muslimprayers.qiblafinder.repo.remote.response.PrayerScheduleResponse
import retrofit2.http.GET
import retrofit2.http.Query

@Keep
interface PrayerService {

//    @SerializedName("calendar")
    @GET("calendar")
    suspend fun getCalendar(
        @Query("latitude")  lat: Double,
        @Query("longitude") long: Double,
        @Query("month") month: Int,
        @Query("year") year: Int,
        @Query("method") method: Int = 2
    ): PrayerScheduleResponse

//    @SerializedName("calendar")
    @GET("calendar")
    suspend fun getPrayerTimings(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
        @Query("month") month: Int,
        @Query("year") year: Int,
        @Query("method") method: Int = 2
    ): PrayerScheduleResponse

//    @SerializedName("calendar")
    @GET("calendar")
    suspend fun getPrayerAlarm(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
        @Query("month") month: Int,
        @Query("year") year: Int,
        @Query("method") method: Int = 2
    ): PrayerScheduleResponse
}