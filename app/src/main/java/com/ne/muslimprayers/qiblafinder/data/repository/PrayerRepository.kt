package com.ne.muslimprayers.qiblafinder.data.repository

import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.repo.States
import kotlinx.coroutines.flow.Flow

interface PrayerRepository {
    suspend fun getCalendar(lat: Double, long: Double, month: Int, year: Int): Flow<States<List<IslamicCalendar>>>
    suspend fun getPrayerTimings(lat: Double, long: Double, month: Int, year: Int): Flow<States<List<SalahDataModel>>>
//    suspend fun getPrayerAlarm(lat: Double, long: Double, month: Int, year: Int): Flow<States<List<SalahScheduleModelData>>>

    suspend fun getPrayerReminder(): Flow<List<PrayerReminder>>
    suspend fun addReminder(listOfReminder: List<PrayerReminder>)
    suspend fun updateReminder(prayerReminder: PrayerReminder)
}