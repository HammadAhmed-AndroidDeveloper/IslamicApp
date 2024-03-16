package com.ne.muslimprayers.qiblafinder.repo.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface PrayersLocalDao {
    @Query("SELECT * FROM prayers")
    fun getPrayersReminder(): Flow<List<LocalDataPrayerAlarm>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPrayerReminder(news: List<LocalDataPrayerAlarm>)

    @Update
    suspend fun updateReminder(news: LocalDataPrayerAlarm)

    @Query("DELETE FROM prayers")
    suspend fun deleteAll()

}