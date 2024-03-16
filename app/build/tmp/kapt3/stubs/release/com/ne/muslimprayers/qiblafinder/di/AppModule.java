package com.ne.muslimprayers.qiblafinder.di;

import android.content.Context;
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository;
import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData;
import com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase;
import com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao;
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource;
import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService;
import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/ne/muslimprayers/qiblafinder/di/AppModule;", "", "()V", "provideAlifDatabase", "Lcom/ne/muslimprayers/qiblafinder/repo/local/AppDatabase;", "appContext", "Landroid/content/Context;", "provideLocalDataSource", "Lcom/ne/muslimprayers/qiblafinder/repo/local/OfflineData;", "prayersLocalDao", "Lcom/ne/muslimprayers/qiblafinder/repo/local/PrayersLocalDao;", "providePrayerAlarm", "Lcom/ne/muslimprayers/qiblafinder/services/PrayerAlarmService;", "providePrayerRepository", "Lcom/ne/muslimprayers/qiblafinder/repo/PrayerRepository;", "remoteDataSource", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/RemoteDataSource;", "offlineData", "providePrayerService", "Lcom/ne/muslimprayers/qiblafinder/repo/remote/network/PrayerService;", "client", "Lokhttp3/OkHttpClient;", "provideReminderDao", "appDatabase", "provideRetrofitClient", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.ne.muslimprayers.qiblafinder.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideRetrofitClient() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService providePrayerService(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase provideAlifDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao provideReminderDao(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.local.OfflineData provideLocalDataSource(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao prayersLocalDao) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.repo.PrayerRepository providePrayerRepository(@org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.ne.muslimprayers.qiblafinder.repo.local.OfflineData offlineData) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService providePrayerAlarm() {
        return null;
    }
}