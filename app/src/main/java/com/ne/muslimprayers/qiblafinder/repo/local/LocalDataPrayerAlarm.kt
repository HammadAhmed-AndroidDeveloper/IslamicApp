package com.ne.muslimprayers.qiblafinder.repo.local

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder

@Entity(tableName = "prayers")
data class LocalDataPrayerAlarm(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "index")
    val index: Int,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "reminded")
    var isReminded: Boolean
){
    companion object{
        val INIT = listOf(
            LocalDataPrayerAlarm(0, "_", false),
            LocalDataPrayerAlarm(1, "_", false),
            LocalDataPrayerAlarm(2, "_", false),
            LocalDataPrayerAlarm(3, "_", false),
            LocalDataPrayerAlarm(4, "_", false)
        )
    }
}

fun List<LocalDataPrayerAlarm>.toPayerReminders(): List<PrayerReminder> {
    val listOfPrayerReminder = mutableListOf<PrayerReminder>()
    this.forEach {
        listOfPrayerReminder.add(PrayerReminder(it.index, it.time, it.isReminded))
    }
    return listOfPrayerReminder
}