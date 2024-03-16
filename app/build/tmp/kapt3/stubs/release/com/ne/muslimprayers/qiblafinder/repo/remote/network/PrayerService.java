package com.ne.muslimprayers.qiblafinder.repo.remote.network;

import com.google.errorprone.annotations.Keep;
import com.google.gson.annotations.SerializedName;
import com.ne.muslimprayers.qiblafinder.repo.remote.response.PrayerScheduleResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

@com.google.errorprone.annotations.Keep
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJC\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJC\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/network/PrayerService;", "", "getCalendar", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/PrayerScheduleResponse;", "lat", "", "long", "month", "", "year", "method", "(DDIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerAlarm", "getPrayerTimings", "app_release"})
public abstract interface PrayerService {
    
    @retrofit2.http.GET(value = "calendar")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCalendar(@retrofit2.http.Query(value = "latitude")
    double lat, @retrofit2.http.Query(value = "longitude")
    double p1_1663806, @retrofit2.http.Query(value = "month")
    int month, @retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "method")
    int method, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ne.muslimprayers.qiblafinder.repo.remote.response.PrayerScheduleResponse> $completion);
    
    @retrofit2.http.GET(value = "calendar")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPrayerTimings(@retrofit2.http.Query(value = "latitude")
    double lat, @retrofit2.http.Query(value = "longitude")
    double p1_1663806, @retrofit2.http.Query(value = "month")
    int month, @retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "method")
    int method, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ne.muslimprayers.qiblafinder.repo.remote.response.PrayerScheduleResponse> $completion);
    
    @retrofit2.http.GET(value = "calendar")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPrayerAlarm(@retrofit2.http.Query(value = "latitude")
    double lat, @retrofit2.http.Query(value = "longitude")
    double p1_1663806, @retrofit2.http.Query(value = "month")
    int month, @retrofit2.http.Query(value = "year")
    int year, @retrofit2.http.Query(value = "method")
    int method, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ne.muslimprayers.qiblafinder.repo.remote.response.PrayerScheduleResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}