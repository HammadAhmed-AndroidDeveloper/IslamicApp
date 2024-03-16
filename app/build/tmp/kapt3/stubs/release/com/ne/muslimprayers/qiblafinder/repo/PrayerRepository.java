package com.ne.muslimprayers.qiblafinder.repo;

import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData;
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJC\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019JC\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "Lcom/ne/muslimprayers/qiblafinder/data/repository/PrayerRepository;", "remoteDataSource", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/RemoteDataSource;", "offlineData", "Lcom/ne/muslimprayers/qiblafinder/repo/local/OfflineData;", "(Lcom/ne/muslimprayers/qiblafinder/repo/remote/RemoteDataSource;Lcom/ne/muslimprayers/qiblafinder/repo/local/OfflineData;)V", "addReminder", "", "listOfReminder", "", "Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCalendar", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ne/muslimprayers/qiblafinder/repo/States;", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "lat", "", "long", "month", "", "year", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerReminder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerTimings", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "updateReminder", "prayerReminder", "(Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class PrayerRepository implements com.ne.muslimprayers.qiblafinder.data.repository.PrayerRepository {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.local.OfflineData offlineData = null;
    
    @javax.inject.Inject
    public PrayerRepository(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.OfflineData offlineData) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getPrayerTimings(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCalendar(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getPrayerReminder(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addReminder(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder> listOfReminder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateReminder(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder prayerReminder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}