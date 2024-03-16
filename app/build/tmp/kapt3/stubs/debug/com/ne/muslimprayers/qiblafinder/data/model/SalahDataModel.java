package com.ne.muslimprayers.qiblafinder.data.model;

import com.ne.muslimprayers.qiblafinder.repo.remote.response.ScheduleResponse;
import com.ne.muslimprayers.qiblafinder.utils.Utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "", "salahTime", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;", "georgianDate", "Lcom/ne/muslimprayers/qiblafinder/data/model/CalendarDataModel;", "hijriDate", "latLongTimeZoneModel", "Lcom/ne/muslimprayers/qiblafinder/data/model/LatLongTimeZoneModel;", "(Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;Lcom/ne/muslimprayers/qiblafinder/data/model/CalendarDataModel;Lcom/ne/muslimprayers/qiblafinder/data/model/CalendarDataModel;Lcom/ne/muslimprayers/qiblafinder/data/model/LatLongTimeZoneModel;)V", "getGeorgianDate", "()Lcom/ne/muslimprayers/qiblafinder/data/model/CalendarDataModel;", "getHijriDate", "getLatLongTimeZoneModel", "()Lcom/ne/muslimprayers/qiblafinder/data/model/LatLongTimeZoneModel;", "getSalahTime", "()Lcom/ne/muslimprayers/qiblafinder/data/model/SalahTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
public final class SalahDataModel {
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime = null;
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel georgianDate = null;
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel hijriDate = null;
    @org.jetbrains.annotations.NotNull
    private final com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel latLongTimeZoneModel = null;
    @org.jetbrains.annotations.NotNull
    private static final com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel EMPTY = null;
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel.Companion Companion = null;
    
    public SalahDataModel(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel georgianDate, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel hijriDate, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel latLongTimeZoneModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahTime getSalahTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel getGeorgianDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel getHijriDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel getLatLongTimeZoneModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahTime component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel copy(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.SalahTime salahTime, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel georgianDate, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.CalendarDataModel hijriDate, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.data.model.LatLongTimeZoneModel latLongTimeZoneModel) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel$Companion;", "", "()V", "EMPTY", "Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "getEMPTY", "()Lcom/ne/muslimprayers/qiblafinder/data/model/SalahDataModel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel getEMPTY() {
            return null;
        }
    }
}