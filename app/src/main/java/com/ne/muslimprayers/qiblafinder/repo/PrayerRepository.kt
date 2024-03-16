package com.ne.muslimprayers.qiblafinder.repo

import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.data.model.toReminderEntities
import com.ne.muslimprayers.qiblafinder.data.model.toReminderEntity
import com.ne.muslimprayers.qiblafinder.data.repository.PrayerRepository
import com.ne.muslimprayers.qiblafinder.repo.local.OfflineData
import com.ne.muslimprayers.qiblafinder.repo.local.toPayerReminders
import com.ne.muslimprayers.qiblafinder.repo.remote.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PrayerRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource, private val offlineData: OfflineData
) : PrayerRepository {

    override suspend fun getPrayerTimings(
        lat: Double, long: Double, month: Int, year: Int
    ): Flow<States<List<SalahDataModel>>> =
        remoteDataSource.getPrayerTimings(lat, long, month, year)

    override suspend fun getCalendar(
        lat: Double, long: Double, month: Int, year: Int
    ): Flow<States<List<IslamicCalendar>>> = remoteDataSource.getCalendar(lat, long, month, year)

//    override suspend fun getPrayerAlarm(
//        lat: Double, long: Double, month: Int, year: Int
//    ): Flow<States<List<SalahScheduleModelData>>> =
//        remoteDataSource.getPrayerAlarm(lat, long, month, year)

    override suspend fun getPrayerReminder(): Flow<List<PrayerReminder>> {
        return offlineData.getPrayersReminder().map { it.toPayerReminders() }
    }

    override suspend fun addReminder(listOfReminder: List<PrayerReminder>) {
        offlineData.addPrayerReminder(listOfReminder.toReminderEntities())
    }

    override suspend fun updateReminder(prayerReminder: PrayerReminder) {
        offlineData.updateReminder(prayerReminder.toReminderEntity())
    }
}
