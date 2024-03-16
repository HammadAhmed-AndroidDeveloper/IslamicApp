package com.ne.muslimprayers.qiblafinder.repo.local;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/local/LocalDataPrayerAlarm;", "", "index", "", "time", "", "isReminded", "", "(ILjava/lang/String;Z)V", "getIndex", "()I", "()Z", "setReminded", "(Z)V", "getTime", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_debug"})
@androidx.room.Entity(tableName = "prayers")
public final class LocalDataPrayerAlarm {
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "index")
    private final int index = 0;
    @androidx.room.ColumnInfo(name = "time")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String time = null;
    @androidx.room.ColumnInfo(name = "reminded")
    private boolean isReminded;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm> INIT = null;
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm.Companion Companion = null;
    
    public LocalDataPrayerAlarm(@androidx.annotation.NonNull
    int index, @org.jetbrains.annotations.NotNull
    java.lang.String time, boolean isReminded) {
        super();
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTime() {
        return null;
    }
    
    public final boolean isReminded() {
        return false;
    }
    
    public final void setReminded(boolean p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm copy(@androidx.annotation.NonNull
    int index, @org.jetbrains.annotations.NotNull
    java.lang.String time, boolean isReminded) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/repo/local/LocalDataPrayerAlarm$Companion;", "", "()V", "INIT", "", "Lcom/ne/muslimprayers/qiblafinder/repo/local/LocalDataPrayerAlarm;", "getINIT", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm> getINIT() {
            return null;
        }
    }
}