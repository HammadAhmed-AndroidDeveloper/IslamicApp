package com.ne.muslimprayers.qiblafinder.utils;

import android.Manifest;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import com.ne.muslimprayers.qiblafinder.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/utils/CompassEvaluater;", "Landroid/app/Service;", "Landroid/location/LocationListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "UPDATER", "", "UPDATE_AFTER", "canGetLocation", "", "isGPSEnabled", "isNetworkEnabled", "latitude", "", "location", "Landroid/location/Location;", "locationManager", "Landroid/location/LocationManager;", "longitude", "getAcutalLocation", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onLocationChanged", "", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "showSettingsAlert", "app_debug"})
public final class CompassEvaluater extends android.app.Service implements android.location.LocationListener {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private boolean isGPSEnabled = false;
    private boolean isNetworkEnabled = false;
    private boolean canGetLocation = false;
    private final long UPDATE_AFTER = 100L;
    private final long UPDATER = 60000L;
    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public android.location.Location location;
    @kotlin.jvm.JvmField
    public double latitude = 0.0;
    @kotlin.jvm.JvmField
    public double longitude = 0.0;
    @org.jetbrains.annotations.Nullable
    private android.location.LocationManager locationManager;
    
    public CompassEvaluater(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final android.location.Location getAcutalLocation() {
        return null;
    }
    
    public final boolean canGetLocation() {
        return false;
    }
    
    public final void showSettingsAlert() {
    }
    
    @java.lang.Override
    public void onLocationChanged(@org.jetbrains.annotations.NotNull
    android.location.Location location) {
    }
    
    @java.lang.Override
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    @java.lang.Override
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    @java.lang.Override
    public void onStatusChanged(@org.jetbrains.annotations.NotNull
    java.lang.String provider, int status, @org.jetbrains.annotations.NotNull
    android.os.Bundle extras) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
}