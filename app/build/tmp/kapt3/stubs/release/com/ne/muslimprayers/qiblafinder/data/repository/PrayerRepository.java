package com.ne.muslimprayers.qiblafinder.data.repository;

import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.repo.States;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007JC\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014JC\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/data/repository/PrayerRepository;", "", "addReminder", "", "listOfReminder", "", "Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCalendar", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ne/muslimprayers/qiblafinder/repo/States;", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "lat", "", "long", "month", "", "year", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerReminder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayerTimings", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "updateReminder", "prayerReminder", "(Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface PrayerRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCalendar(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPrayerTimings(double lat, double p1_1663806, int month, int year, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ne.muslimprayers.qiblafinder.repo.States<java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPrayerReminder(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addReminder(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder> listOfReminder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateReminder(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder prayerReminder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}