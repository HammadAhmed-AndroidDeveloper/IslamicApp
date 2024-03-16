package com.ne.muslimprayers.qiblafinder.repo.remote;

import android.util.Log;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.repo.States;
import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JC\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010JC\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/RemoteDataSource;", "", "prayerService", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/network/PrayerService;", "(Lcom/ne/muslimprayers/qiblafinder/repo/remote/network/PrayerService;)V", "getCalendar", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ne/muslimprayers/qiblafinder/repo/States;", "", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "lat", "", "long", "month", "", "year", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerAlarm", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahScheduleModelData;", "getPrayerTimings", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "Companion", "app_release"})
public final class RemoteDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService prayerService = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "RemoteDataSource";
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource.Companion Companion = null;
    
    @javax.inject.Inject
    public RemoteDataSource(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService prayerService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCalendar(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar>>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPrayerTimings(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel>>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPrayerAlarm(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData>>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/RemoteDataSource$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}