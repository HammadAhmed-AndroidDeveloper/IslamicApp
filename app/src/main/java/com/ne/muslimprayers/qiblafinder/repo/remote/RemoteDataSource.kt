package com.ne.muslimprayers.qiblafinder.repo.remote

import android.util.Log
import com.ne.muslimprayers.qiblafinder.data.model.IslamicCalendar
import com.ne.muslimprayers.qiblafinder.data.model.SalahDataModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahScheduleModelData
import com.ne.muslimprayers.qiblafinder.repo.States
import com.ne.muslimprayers.qiblafinder.repo.remote.network.PrayerService
import com.ne.muslimprayers.qiblafinder.utils.Utils.getAllPrayers
import com.ne.muslimprayers.qiblafinder.utils.Utils.getCalendarData
import com.ne.muslimprayers.qiblafinder.utils.Utils.getAgenda
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class RemoteDataSource @Inject constructor(
    private val prayerService: PrayerService,
) {
    companion object {
        private const val TAG = "RemoteDataSource"
    }

    suspend fun getCalendar(lat: Double, long: Double, month: Int, year: Int) =
        flow<States<List<IslamicCalendar>>> {
            emit(States.loading())
            val response = prayerService.getCalendar(lat, long, month, year)
            response.data.let {
                if (it?.isNotEmpty() == true) emit(States.success(getCalendarData(it)))
                else emit(States.success(listOf()))
            }
        }.catch {
            Log.d(TAG, "getSchedule: failed = ${it.message}")
            emit(States.failed(it.message ?: ""))
        }.flowOn(Dispatchers.IO)

    suspend fun getPrayerTimings(lat: Double, long: Double, month: Int, year: Int) =
        flow<States<List<SalahDataModel>>> {
            emit(States.loading())
            val response = prayerService.getPrayerTimings(lat, long, month, year)
            response.data.let {
                if (it?.isNotEmpty() == true) emit(States.success(getAllPrayers(it)))
                else emit(States.success(listOf()))
            }
        }.catch {
            Log.d(TAG, "getSchedule: failed = ${it.message}")
            emit(States.failed(it.message ?: ""))
        }.flowOn(Dispatchers.IO)

    suspend fun getPrayerAlarm(lat: Double, long: Double, month: Int, year: Int) =
        flow<States<List<SalahScheduleModelData>>> {
            emit(States.loading())
            val response = prayerService.getPrayerAlarm(lat, long, month, year)
            response.data.let {
                if (it?.isNotEmpty() == true) emit(States.success(getAgenda(it)))
                else emit(States.success(listOf()))
            }
        }.catch {
            Log.d(TAG, "getSchedule: failed = ${it.message}")
            emit(States.failed(it.message ?: ""))
        }.flowOn(Dispatchers.IO)
}
