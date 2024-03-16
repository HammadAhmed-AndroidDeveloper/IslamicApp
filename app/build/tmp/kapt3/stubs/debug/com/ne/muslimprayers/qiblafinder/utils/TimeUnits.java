package com.ne.muslimprayers.qiblafinder.utils;

import android.text.format.DateFormat;
import com.google.firebase.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0015\u0010\u000b\u001a\u00020\f*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u00020\f*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0015\u0010\u0013\u001a\u00020\f*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\u0015\u001a\u00020\u0004*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0015\u0010\u0017\u001a\u00020\f*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0015\u0010\u001b\u001a\u00020\f*\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u001f\u001a\u00020\b*\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0015\u0010\"\u001a\u00020\u0004*\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\n\u00a8\u0006&"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/utils/TimeUnits;", "", "()V", "indexOfDay", "", "getIndexOfDay", "()I", "day", "Lcom/google/firebase/Timestamp;", "getDay", "(Lcom/google/firebase/Timestamp;)I", "dayOfWeek", "", "getDayOfWeek", "(Lcom/google/firebase/Timestamp;)Ljava/lang/String;", "formatDate", "getFormatDate", "hour", "getHour", "hourMinutes", "getHourMinutes", "minutes", "getMinutes", "montYear", "getMontYear", "month", "getMonth", "stringFormat", "Ljava/util/Date;", "getStringFormat", "(Ljava/util/Date;)Ljava/lang/String;", "timeStamp", "getTimeStamp", "(Ljava/lang/String;)Lcom/google/firebase/Timestamp;", "year", "getYear", "getCalendar", "Ljava/util/Calendar;", "app_debug"})
public final class TimeUnits {
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.utils.TimeUnits INSTANCE = null;
    
    private TimeUnits() {
        super();
    }
    
    public final int getDay(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$day) {
        return 0;
    }
    
    public final int getMonth(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$month) {
        return 0;
    }
    
    public final int getYear(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$year) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDayOfWeek(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$dayOfWeek) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMontYear(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$montYear) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormatDate(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$formatDate) {
        return null;
    }
    
    public final int getHour(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$hour) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHourMinutes(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$hourMinutes) {
        return null;
    }
    
    public final int getMinutes(@org.jetbrains.annotations.NotNull
    com.google.firebase.Timestamp $this$minutes) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStringFormat(@org.jetbrains.annotations.NotNull
    java.util.Date $this$stringFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.Timestamp getTimeStamp(@org.jetbrains.annotations.NotNull
    java.lang.String $this$timeStamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Calendar getCalendar(int year, int month, int day) {
        return null;
    }
    
    public final int getIndexOfDay() {
        return 0;
    }
}