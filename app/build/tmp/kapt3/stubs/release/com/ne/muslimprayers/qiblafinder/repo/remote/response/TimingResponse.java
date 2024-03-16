package com.ne.muslimprayers.qiblafinder.repo.remote.response;

import com.google.errorprone.annotations.Keep;
import com.google.gson.annotations.SerializedName;

@com.google.errorprone.annotations.Keep
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/remote/response/TimingResponse;", "", "sunset", "", "asr", "isha", "fajr", "dhuhr", "maghrib", "sunrise", "midnight", "imsak", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsr", "()Ljava/lang/String;", "getDhuhr", "getFajr", "getImsak", "getIsha", "getMaghrib", "getMidnight", "getSunrise", "getSunset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class TimingResponse {
    @com.google.gson.annotations.SerializedName(value = "Sunset")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunset = null;
    @com.google.gson.annotations.SerializedName(value = "Asr")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String asr = null;
    @com.google.gson.annotations.SerializedName(value = "Isha")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String isha = null;
    @com.google.gson.annotations.SerializedName(value = "Fajr")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String fajr = null;
    @com.google.gson.annotations.SerializedName(value = "Dhuhr")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String dhuhr = null;
    @com.google.gson.annotations.SerializedName(value = "Maghrib")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String maghrib = null;
    @com.google.gson.annotations.SerializedName(value = "Sunrise")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunrise = null;
    @com.google.gson.annotations.SerializedName(value = "Midnight")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String midnight = null;
    @com.google.gson.annotations.SerializedName(value = "Imsak")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String imsak = null;
    
    public TimingResponse(@org.jetbrains.annotations.Nullable
    java.lang.String sunset, @org.jetbrains.annotations.Nullable
    java.lang.String asr, @org.jetbrains.annotations.Nullable
    java.lang.String isha, @org.jetbrains.annotations.Nullable
    java.lang.String fajr, @org.jetbrains.annotations.Nullable
    java.lang.String dhuhr, @org.jetbrains.annotations.Nullable
    java.lang.String maghrib, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String midnight, @org.jetbrains.annotations.Nullable
    java.lang.String imsak) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAsr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIsha() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFajr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDhuhr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMaghrib() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunrise() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMidnight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImsak() {
        return null;
    }
    
    public TimingResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
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
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.remote.response.TimingResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.String sunset, @org.jetbrains.annotations.Nullable
    java.lang.String asr, @org.jetbrains.annotations.Nullable
    java.lang.String isha, @org.jetbrains.annotations.Nullable
    java.lang.String fajr, @org.jetbrains.annotations.Nullable
    java.lang.String dhuhr, @org.jetbrains.annotations.Nullable
    java.lang.String maghrib, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String midnight, @org.jetbrains.annotations.Nullable
    java.lang.String imsak) {
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