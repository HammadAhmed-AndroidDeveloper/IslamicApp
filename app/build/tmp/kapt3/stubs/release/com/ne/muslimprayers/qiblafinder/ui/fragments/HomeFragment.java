package com.ne.muslimprayers.qiblafinder.ui.fragments;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.R;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel;
import com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel;
import com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel;
import com.ne.muslimprayers.qiblafinder.databinding.FragmentHomeBinding;
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits;
import com.ne.muslimprayers.qiblafinder.utils.Utils;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ne/muslimprayers/qiblafinder/databinding/FragmentHomeBinding;", "calendarViewModel", "Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/CalendarViewModel;", "getCalendarViewModel", "()Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/CalendarViewModel;", "calendarViewModel$delegate", "Lkotlin/Lazy;", "homeViewModel", "Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/PrayerTimingViewModel;", "getHomeViewModel", "()Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/PrayerTimingViewModel;", "homeViewModel$delegate", "mAdView", "Lcom/google/android/gms/ads/AdView;", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "scope1", "getPrayerTimings", "", "pd", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onStop", "populateCurrentSchedule", "schedule", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "app_release"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleCoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleCoroutineScope scope1 = null;
    private com.ne.muslimprayers.qiblafinder.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy calendarViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.ads.AdView mAdView;
    
    public HomeFragment() {
        super();
    }
    
    private final com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel getHomeViewModel() {
        return null;
    }
    
    private final com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel getCalendarViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void populateCurrentSchedule(com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar schedule) {
    }
    
    private final void getPrayerTimings(com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel pd) {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}