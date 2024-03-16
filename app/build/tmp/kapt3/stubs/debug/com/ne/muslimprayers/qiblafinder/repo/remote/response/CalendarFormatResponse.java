package com.ne.muslimprayers.qiblafinder.repo.remote.response;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u00c6\u0003Jc\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/CalendarFormatResponse;", "", "date", "", "monthResponse", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/MonthResponse;", "year", "format", "weekdayResponse", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/WeekdayResponse;", "day", "holidays", "", "(Ljava/lang/String;Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/MonthResponse;Ljava/lang/String;Ljava/lang/String;Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/WeekdayResponse;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getDay", "getFormat", "getHolidays", "()Ljava/util/List;", "getMonthResponse", "()Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/MonthResponse;", "getWeekdayResponse", "()Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/WeekdayResponse;", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CalendarFormatResponse {
    @com.google.gson.annotations.SerializedName(value = "date")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String date = null;
    @com.google.gson.annotations.SerializedName(value = "month")
    @org.jetbrains.annotations.Nullable
    private final com.ne.muslimprayers.qiblafinder.repo.remote.response.MonthResponse monthResponse = null;
    @com.google.gson.annotations.SerializedName(value = "year")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String year = null;
    @com.google.gson.annotations.SerializedName(value = "format")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String format = null;
    @com.google.gson.annotations.SerializedName(value = "weekday")
    @org.jetbrains.annotations.Nullable
    private final com.ne.muslimprayers.qiblafinder.repo.remote.response.WeekdayResponse weekdayResponse = null;
    @com.google.gson.annotations.SerializedName(value = "day")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String day = null;
    @com.google.gson.annotations.SerializedName(value = "holidays")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> holidays = null;
    
    public CalendarFormatResponse(@org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.MonthResponse monthResponse, @org.jetbrains.annotations.Nullable
    java.lang.String year, @org.jetbrains.annotations.Nullable
    java.lang.String format, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.WeekdayResponse weekdayResponse, @org.jetbrains.annotations.Nullable
    java.lang.String day, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> holidays) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.MonthResponse getMonthResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.WeekdayResponse getWeekdayResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getHolidays() {
        return null;
    }
    
    public CalendarFormatResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.MonthResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.WeekdayResponse component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.MonthResponse monthResponse, @org.jetbrains.annotations.Nullable
    java.lang.String year, @org.jetbrains.annotations.Nullable
    java.lang.String format, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.WeekdayResponse weekdayResponse, @org.jetbrains.annotations.Nullable
    java.lang.String day, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> holidays) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}