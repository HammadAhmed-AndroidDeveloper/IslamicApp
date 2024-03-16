package com.ne.muslimprayers.qiblafinder.data.viewmodels;

import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime;
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.repo.States;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u001e\u0010\"\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/CalendarViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "(Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;)V", "calednarLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "calendarData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCalendarData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setCalendarData", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "css", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahScheduleModelData;", "currentSalahScheduleModelData", "currentSalahTime", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;", "salahTimings", "getCalendar", "Lkotlinx/coroutines/Job;", "lat", "", "long", "date", "Lcom/google/firebase/Timestamp;", "pb", "Landroid/widget/ProgressBar;", "getPrayersData", "salahTime", "onSuccess", "", "schedule", "updatePrayerReminder", "data", "", "Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CalendarViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.repo.PrayerRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar> calendarData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar> calednarLiveData = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData> currentSalahScheduleModelData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData> css = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.SalahTime> salahTimings;
    @org.jetbrains.annotations.NotNull
    private com.ne.muslimprayers.qiblafinder.data.model.SalahTime currentSalahTime;
    
    @javax.inject.Inject
    public CalendarViewModel(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.PrayerRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar> getCalendarData() {
        return null;
    }
    
    public final void setCalendarData(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getCalendar(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp date, @org.jetbrains.annotations.NotNull
    android.widget.ProgressBar pb) {
        return null;
    }
    
    private final void onSuccess(com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar schedule) {
    }
    
    private final kotlinx.coroutines.Job getPrayersData(com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime) {
        return null;
    }
    
    private final void updatePrayerReminder(com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, java.util.List<com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder> data) {
    }
}