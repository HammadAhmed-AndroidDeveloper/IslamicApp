package com.ne.muslimprayers.qiblafinder.di

import android.content.Context
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository
import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData
import com.ne.muslimprayers.qiblafinder.repo.local.AppDatabase
import com.ne.muslimprayers.qiblafinder.repo.local.PrayersLocalDao
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource
import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService
import com.ne.muslimprayers.qiblafinder.services.PrayerAlarmService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRetrofitClient(): OkHttpClient {
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    }

    @Provides
    fun providePrayerService(client: OkHttpClient): PrayerService {
        val retrofit = Retrofit.Builder().baseUrl("https://api.aladhan.com/v1/")
            .addConverterFactory(GsonConverterFactory.create()).client(client).build()
        return retrofit.create(PrayerService::class.java)
    }


    @Provides
    fun provideAlifDatabase(@ApplicationContext appContext: Context): AppDatabase =
        AppDatabase.getInstance(appContext)

    @Provides
    fun provideReminderDao(appDatabase: AppDatabase): PrayersLocalDao = appDatabase.reminderDao()

    @Provides
    fun provideLocalDataSource(prayersLocalDao: PrayersLocalDao) = OfflineData(prayersLocalDao)

    @Provides
    fun providePrayerRepository(
        remoteDataSource: RemoteDataSource, offlineData: OfflineData
    ): PrayerRepository = PrayerRepository(remoteDataSource, offlineData)

    @Provides
    fun providePrayerAlarm(): PrayerAlarmService = PrayerAlarmService()
}