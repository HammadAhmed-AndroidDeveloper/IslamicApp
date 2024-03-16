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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.adapter.PrayerTimingsAdapter;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel;
import com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel;
import com.ne.muslimprayers.qiblafinder.databinding.FragmentPrayersTimingBinding;
import com.ne.muslimprayers.qiblafinder.interfaces.PrayerAlarmListener;
import com.ne.muslimprayers.qiblafinder.utils.Utils;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/fragments/PrayersTimingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/ne/muslimprayers/qiblafinder/adapter/PrayerTimingsAdapter;", "binding", "Lcom/ne/muslimprayers/qiblafinder/databinding/FragmentPrayersTimingBinding;", "data", "Ljava/util/ArrayList;", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahModel;", "Lkotlin/collections/ArrayList;", "homeViewModel", "Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/PrayerTimingViewModel;", "getHomeViewModel", "()Lcom/ne/muslimprayers/qiblafinder/data/viewmodels/PrayerTimingViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getPrayers", "", "schedule", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class PrayersTimingFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleCoroutineScope scope = null;
    private com.ne.muslimprayers.qiblafinder.adapter.PrayerTimingsAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.ne.muslimprayers.qiblafinder.data.model.SalahModel> data = null;
    private com.ne.muslimprayers.qiblafinder.databinding.FragmentPrayersTimingBinding binding;
    
    public PrayersTimingFragment() {
        super();
    }
    
    private final com.ne.muslimprayers.qiblafinder.data.viewmodels.PrayerTimingViewModel getHomeViewModel() {
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
    private final void getPrayers(com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel schedule) {
    }
}