package com.ne.muslimprayers.qiblafinder.data.viewmodels;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime;
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.repo.States;
import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService;
import com.ne.muslimprayers.qiblafinder.utils.Utils;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)J&\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000eH\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001bH\u0002J.\u00106\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u0010\'\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=J\u001e\u0010>\u001a\u0002042\u0006\u0010\'\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f\u00a8\u0006B"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/PrayerTimingViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "prayerAlarmService", "Lcom/ne/muslimprayers/qiblafinder/services/PrayerAlarmService;", "(Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;Lcom/ne/muslimprayers/qiblafinder/services/PrayerAlarmService;)V", "cdt", "Landroid/os/CountDownTimer;", "css", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahScheduleModelData;", "currentSalahScheduleModelData", "currentSalahTime", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;", "newData", "", "kotlin.jvm.PlatformType", "getNewData", "()Landroidx/lifecycle/MutableLiveData;", "setNewData", "(Landroidx/lifecycle/MutableLiveData;)V", "newDataMetaData", "getNewDataMetaData", "setNewDataMetaData", "salahFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "getSalahFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setSalahFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "salahLiveData", "getSalahLiveData", "setSalahLiveData", "salatimings", "getSalatimings", "setSalatimings", "Lkotlinx/coroutines/Job;", "salahTime", "salahModel", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahModel;", "getPrayerTimings", "lat", "", "long", "date", "Lcom/google/firebase/Timestamp;", "pb", "Landroid/widget/ProgressBar;", "getPrayersAlaarms", "onSuccess", "", "schedule", "setAlarm", "context", "Landroid/content/Context;", "prayerTime", "isReminded", "", "position", "", "updateAlarms", "listOfReminder", "", "Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PrayerTimingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.PrayerRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService prayerAlarmService = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> salahFlow;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> salahLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData> currentSalahScheduleModelData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData> css = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahTime> salatimings;
    @org.jetbrains.annotations.NotNull
    private com.ne.muslimprayers.qiblafinder.data.model.SalahTime currentSalahTime;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> newData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> newDataMetaData;
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer cdt;
    
    @javax.inject.Inject
    public PrayerTimingViewModel(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.PrayerRepository repository, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService prayerAlarmService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> getSalahFlow() {
        return null;
    }
    
    public final void setSalahFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> getSalahLiveData() {
        return null;
    }
    
    public final void setSalahLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahTime> getSalatimings() {
        return null;
    }
    
    public final void setSalatimings(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahTime> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNewData() {
        return null;
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNewDataMetaData() {
        return null;
    }
    
    public final void setNewDataMetaData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getPrayerTimings(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp date, @org.jetbrains.annotations.NotNull
    android.widget.ProgressBar pb) {
        return null;
    }
    
    private final void onSuccess(com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel schedule) {
    }
    
    private final kotlinx.coroutines.Job getPrayersAlaarms(com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime) {
        return null;
    }
    
    private final void updateAlarms(com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder> listOfReminder) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job setAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, @org.jetbrains.annotations.NotNull
    java.lang.String prayerTime, boolean isReminded, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getNewData(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahModel salahModel) {
        return null;
    }
}