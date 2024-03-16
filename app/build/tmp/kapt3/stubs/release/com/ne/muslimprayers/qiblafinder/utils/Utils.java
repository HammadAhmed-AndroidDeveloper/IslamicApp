package com.ne.muslimprayers.qiblafinder.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.R;
import com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar;
import com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel;
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData;
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime;
import com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001fJ\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\t*\u00020\u0012J\u0010\u0010!\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00100\t\u00a8\u0006\""}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/utils/Utils;", "", "()V", "getAgenda", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahScheduleModelData;", "response", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/ScheduleResponse;", "", "data", "", "getAllPrayers", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "getCalendarData", "Lcom/ne/muslimprayers/qiblafinder/data/model/IslamicCalendar;", "getPrayerData", "getSalahScheduleBy", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahModel;", "ts", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;", "timestamp", "Lcom/google/firebase/Timestamp;", "getScheduleName", "", "time", "isLocationEnabled", "", "context", "Landroid/content/Context;", "isNetworkAvailable", "showLocationErrorDialog", "", "Landroidx/fragment/app/FragmentActivity;", "convert", "timings", "app_release"})
public final class Utils {
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.utils.Utils INSTANCE = null;
    
    private Utils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScheduleName(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime ts, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahModel time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahModel getSalahScheduleBy(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime ts, @org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahModel> convert(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime $this$convert) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahTime timings(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahModel> $this$timings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData> getAgenda(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar> getCalendarData(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel> getAllPrayers(@org.jetbrains.annotations.NotNull
    java.util.List<com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData getAgenda(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar getCalendarData(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel getPrayerData(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse response) {
        return null;
    }
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void showLocationErrorDialog(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity context) {
    }
}