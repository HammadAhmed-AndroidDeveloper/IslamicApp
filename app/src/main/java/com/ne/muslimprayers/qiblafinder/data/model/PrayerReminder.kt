package com.ne.muslimprayers.qiblafinder.data.model

import android.os.Parcelable
import com.ne.muslimprayers.qiblafinder.repo.local.LocalDataPrayerAlarm
import kotlinx.parcelize.Parcelize

@Parcelize
data class PrayerReminder(
    val index: Int,
    val time: String,
    var isReminded: Boolean
) : Parcelable {
    companion object{
        val EMPTY = listOf(
            PrayerReminder(0, "_", false),
            PrayerReminder(1, "_", false),
            PrayerReminder(2, "_", false),
            PrayerReminder(3, "_", false),
            PrayerReminder(4, "_", false),
        )
    }
}

val String.hour get() : Int = if (this != "-") this.split(":", " ").first().toInt() else 0
val String.minutes get() : Int = if (this != "-") this.split(":", " ")[1].toInt() else 0

fun List<PrayerReminder>.toReminderEntities(): List<LocalDataPrayerAlarm> {
    val listOfEntity = mutableListOf<LocalDataPrayerAlarm>()
    this.forEach { listOfEntity.add(it.toReminderEntity()) }
    return listOfEntity
}

fun PrayerReminder.toReminderEntity(): LocalDataPrayerAlarm =
    LocalDataPrayerAlarm(this.index, this.time, this.isReminded)