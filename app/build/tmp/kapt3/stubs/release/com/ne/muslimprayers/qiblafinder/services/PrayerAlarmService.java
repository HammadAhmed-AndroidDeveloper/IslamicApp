package com.ne.muslimprayers.qiblafinder.services;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.Timestamp;
import com.ne.muslimprayers.qiblafinder.R;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.ui.activities.MainActivity;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Calendar;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/services/PrayerAlarmService;", "Landroid/content/BroadcastReceiver;", "()V", "repository", "Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "getRepository", "()Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "setRepository", "(Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;)V", "cancelAlarm", "", "context", "Landroid/content/Context;", "id", "", "message", "", "createNotificationCHannel", "nm", "Landroid/app/NotificationManager;", "customNotification", "getPrayer", "index", "onReceive", "intent", "Landroid/content/Intent;", "setAlarm", "reminder", "Lcom/ne/muslimprayers/qiblafinder/data/model/PrayerReminder;", "Companion", "app_release"})
public final class PrayerAlarmService extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_ALARM = "alarm";
    public static final int NOTIFICATION_REQUEST_CODE = 5342;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHANNEL_ID = "QiblaFinder";
    @javax.inject.Inject
    public com.ne.muslimprayers.qiblafinder.repo.PrayerRepository repository;
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService.Companion Companion = null;
    
    public PrayerAlarmService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.PrayerRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.PrayerRepository p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final java.lang.String getPrayer(int index) {
        return null;
    }
    
    public final void setAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder reminder) {
    }
    
    public final void cancelAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, int id, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    private final void customNotification(android.content.Context context, java.lang.String message) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationCHannel(android.app.NotificationManager nm) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/services/PrayerAlarmService$Companion;", "", "()V", "CHANNEL_ID", "", "EXTRA_ALARM", "NOTIFICATION_REQUEST_CODE", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}