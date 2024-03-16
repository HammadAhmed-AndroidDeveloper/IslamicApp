package com.ne.muslimprayers.qiblafinder.repo.remote.response;

import com.google.errorprone.annotations.Keep;
import com.google.gson.annotations.SerializedName;

@com.google.errorprone.annotations.Keep
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/DateResponse;", "", "readable", "", "hijri", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/CalendarFormatResponse;", "gregorian", "timestamp", "(Ljava/lang/String;Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/CalendarFormatResponse;Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/CalendarFormatResponse;Ljava/lang/String;)V", "getGregorian", "()Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/CalendarFormatResponse;", "getHijri", "getReadable", "()Ljava/lang/String;", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class DateResponse {
    @com.google.gson.annotations.SerializedName(value = "readable")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String readable = null;
    @com.google.gson.annotations.SerializedName(value = "hijri")
    @org.jetbrains.annotations.Nullable
    private final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse hijri = null;
    @com.google.gson.annotations.SerializedName(value = "gregorian")
    @org.jetbrains.annotations.Nullable
    private final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse gregorian = null;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String timestamp = null;
    
    public DateResponse(@org.jetbrains.annotations.Nullable
    java.lang.String readable, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse hijri, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse gregorian, @org.jetbrains.annotations.Nullable
    java.lang.String timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReadable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse getHijri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse getGregorian() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    public DateResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.DateResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.String readable, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse hijri, @org.jetbrains.annotations.Nullable
    com.ne.muslimprayers.qiblafinder.repo.remote.response.CalendarFormatResponse gregorian, @org.jetbrains.annotations.Nullable
    java.lang.String timestamp) {
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