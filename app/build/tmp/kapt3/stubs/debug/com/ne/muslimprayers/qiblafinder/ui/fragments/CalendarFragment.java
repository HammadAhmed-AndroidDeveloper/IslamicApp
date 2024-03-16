package com.ne.muslimprayers.qiblafinder.ui.fragments;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel;
import com.ne.muslimprayers.qiblafinder.databinding.FragmentCalendarBinding;
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits;
import com.ne.muslimprayers.qiblafinder.utils.Utils;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/fragments/CalendarFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ne/muslimprayers/qiblafinder/databinding/FragmentCalendarBinding;", "currentLat", "", "currentLong", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "homeViewModel", "Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/CalendarViewModel;", "getHomeViewModel", "()Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/CalendarViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCalendar", "", "schedule", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CalendarFragment extends androidx.fragment.app.Fragment {
    private com.ne.muslimprayers.qiblafinder.databinding.FragmentCalendarBinding binding;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleCoroutineScope scope = null;
    private double currentLat = 0.0;
    private double currentLong = 0.0;
    
    public CalendarFragment() {
        super();
    }
    
    private final com.ne.muslimprayers.qiblafinder.data.viewmodels.CalendarViewModel getHomeViewModel() {
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
    
    private final void getCalendar(com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar schedule) {
    }
}