package com.ne.muslimprayers.qiblafinder.repo.local;

import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/local/OfflineData;", "", "prayersLocalDao", "Lcom/ne/muslimprayers/qiblafinder/repo/local/PrayersLocalDao;", "(Lcom/ne/muslimprayers/qiblafinder/repo/local/PrayersLocalDao;)V", "addPrayerReminder", "", "reminders", "", "Lcom/ne/muslimprayers/qiblafinder/repo/local/LocalDataPrayerAlarm;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayersReminder", "Lkotlinx/coroutines/flow/Flow;", "updateReminder", "reminder", "(Lcom/ne/muslimprayers/qiblafinder/repo/local/LocalDataPrayerAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class OfflineData {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao prayersLocalDao = null;
    
    @javax.inject.Inject
    public OfflineData(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao prayersLocalDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm>> getPrayersReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addPrayerReminder(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm> reminders, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateReminder(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm reminder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}