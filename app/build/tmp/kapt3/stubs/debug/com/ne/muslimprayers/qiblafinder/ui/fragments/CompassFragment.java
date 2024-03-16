package com.ne.muslimprayers.qiblafinder.ui.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.ne.muslimprayers.qiblafinder.utils.CompassEvaluater;
import com.ne.muslimprayers.qiblafinder.R;
import com.ne.muslimprayers.qiblafinder.interfaces.CompassListener;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$J\u001f\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\'\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010*\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010+\u001a\u00020&J\u0018\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/H\u0016J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020&H\u0016J\b\u0010:\u001a\u00020&H\u0016J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020&H\u0016J\b\u0010?\u001a\u00020&H\u0016J\b\u0010@\u001a\u00020&H\u0002J\b\u0010A\u001a\u00020&H\u0002J\b\u0010B\u001a\u00020&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/fragments/CompassFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/hardware/SensorEventListener;", "Lcom/ne/muslimprayers/qiblafinder/interfaces/CompassListener;", "()V", "I", "", "arrowViewQiblat", "Landroid/widget/ImageView;", "azimuth", "", "azimuthFix", "currentAzimuth", "gps", "Lcom/ne/muslimprayers/qiblafinder/utils/CompassEvaluater;", "getGps", "()Lcom/ne/muslimprayers/qiblafinder/utils/CompassEvaluater;", "setGps", "(Lcom/ne/muslimprayers/qiblafinder/utils/CompassEvaluater;)V", "gsensor", "Landroid/hardware/Sensor;", "imageDial", "mGeomagnetic", "mGravity", "msensor", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "setPrefs", "(Landroid/content/SharedPreferences;)V", "r", "sensorManager", "Landroid/hardware/SensorManager;", "GetFloat", "key", "", "SaveFloat", "", "ff", "(Ljava/lang/String;Ljava/lang/Float;)V", "adjustArrowQiblat", "adjustGambarDial", "fetch_GPS", "onAccuracyChanged", "sensor", "accuracy", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNewAzimuth", "onPause", "onResume", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onStart", "onStop", "setupCompass", "start", "stop", "Companion", "app_debug"})
public final class CompassFragment extends androidx.fragment.app.Fragment implements android.hardware.SensorEventListener, com.ne.muslimprayers.qiblafinder.interfaces.CompassListener {
    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView arrowViewQiblat;
    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView imageDial;
    private float currentAzimuth = 0.0F;
    @org.jetbrains.annotations.Nullable
    private android.content.SharedPreferences prefs;
    @org.jetbrains.annotations.Nullable
    private com.ne.muslimprayers.qiblafinder.utils.CompassEvaluater gps;
    @org.jetbrains.annotations.Nullable
    private android.hardware.SensorManager sensorManager;
    @org.jetbrains.annotations.Nullable
    private android.hardware.Sensor gsensor;
    @org.jetbrains.annotations.Nullable
    private android.hardware.Sensor msensor;
    @org.jetbrains.annotations.NotNull
    private final float[] mGravity = null;
    @org.jetbrains.annotations.NotNull
    private final float[] mGeomagnetic = null;
    @org.jetbrains.annotations.NotNull
    private final float[] r = null;
    @org.jetbrains.annotations.NotNull
    private final float[] I = null;
    private float azimuth = 0.0F;
    private float azimuthFix = 0.0F;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "QiblaFinder";
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.ui.fragments.CompassFragment.Companion Companion = null;
    
    public CompassFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.Nullable
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.utils.CompassEvaluater getGps() {
        return null;
    }
    
    public final void setGps(@org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.utils.CompassEvaluater p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    private final void start() {
    }
    
    private final void stop() {
    }
    
    private final void setupCompass() {
    }
    
    public final void adjustGambarDial(float azimuth) {
    }
    
    public final void adjustArrowQiblat(float azimuth) {
    }
    
    public final void SaveFloat(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Float ff) {
    }
    
    public final float GetFloat(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return 0.0F;
    }
    
    public final void fetch_GPS() {
    }
    
    @java.lang.Override
    public void onSensorChanged(@org.jetbrains.annotations.NotNull
    android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override
    public void onAccuracyChanged(@org.jetbrains.annotations.NotNull
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override
    public void onNewAzimuth(float azimuth) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/ui/fragments/CompassFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}