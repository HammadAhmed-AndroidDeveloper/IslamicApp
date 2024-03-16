package com.ne.muslimprayers.qiblafinder.repo.local

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OfflineData @Inject constructor(
    private val prayersLocalDao: PrayersLocalDao
) {
    fun getPrayersReminder(): Flow<List<LocalDataPrayerAlarm>> = prayersLocalDao.getPrayersReminder()
    suspend fun addPrayerReminder(reminders : List<LocalDataPrayerAlarm>) = prayersLocalDao.addPrayerReminder(reminders)
    suspend fun updateReminder(reminder: LocalDataPrayerAlarm) = prayersLocalDao.updateReminder(reminder)


}