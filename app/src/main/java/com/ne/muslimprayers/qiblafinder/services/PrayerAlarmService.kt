package com.ne.muslimprayers.qiblafinder.services

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.google.firebase.Timestamp
import com.ne.muslimprayers.qiblafinder.R
import com.ne.muslimprayers.qiblafinder.utils.TimeUnits.hour
import com.ne.muslimprayers.qiblafinder.data.model.PrayerReminder
import com.ne.muslimprayers.qiblafinder.data.model.hour
import com.ne.muslimprayers.qiblafinder.data.model.minutes
import com.ne.muslimprayers.qiblafinder.repo.PrayerRepository
import com.ne.muslimprayers.qiblafinder.ui.activities.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.Calendar
import javax.inject.Inject

@AndroidEntryPoint
class PrayerAlarmService : BroadcastReceiver() {

    companion object {
        const val EXTRA_ALARM = "alarm"
        const val NOTIFICATION_REQUEST_CODE = 5342
        const val CHANNEL_ID = "QiblaFinder"
    }

    @Inject
    lateinit var repository: PrayerRepository

    override fun onReceive(context: Context, intent: Intent) {
        intent.extras?.getParcelable<PrayerReminder>(EXTRA_ALARM)?.let {
            val hr = it.time.split(":").first().toInt()
            if (hr >= Timestamp.now().hour) {
                customNotification(context, buildString {
                    append("It's currently ")
                    append(it.time)
                    append(" which means it's time for ")
                    append(getPrayer(it.index))
                    append(" prayer.")
                })
                val mp = MediaPlayer.create(
                    context, if (it.index == 1) R.raw.adzan_fajr else R.raw.adzan_makkah
                )
                    mp.isLooping = false
                    mp.start()
            }
        }
    }

    private fun getPrayer(index: Int) = when (index) {
        0 -> "Fajr"
        1 -> "Dohar"
        2 -> "Asr"
        3 -> "Maghrib"
        4 -> "Isha"
        else -> "_"
    }

    fun setAlarm(
        context: Context,
        reminder: PrayerReminder
    ) {
        val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, PrayerAlarmService::class.java)
        intent.putExtra(EXTRA_ALARM, reminder)
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, reminder.time.hour)
            set(Calendar.MINUTE, reminder.time.minutes)
            set(Calendar.SECOND, 0)
        }

        val pi = PendingIntent.getBroadcast(
            context, reminder.index,
            intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
        )
        am.setInexactRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY,
            pi
        )
        Toast.makeText(
            context,
            "${getPrayer(reminder.index)} Reminder set at ${reminder.time}",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun cancelAlarm(context: Context, id: Int, message: String? = "") {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, PrayerAlarmService::class.java)
        val pendingIntent = PendingIntent.getBroadcast(
            context, id, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        pendingIntent.cancel()
        alarmManager.cancel(pendingIntent)
        message?.let {
            if (it.isNotBlank()) {
                val text = "${getPrayer(id)} Reminder is unset now"
                Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun customNotification(
        context: Context,
        message: String
    ) {
        val nm =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP

        val pi = PendingIntent.getActivity(
            context, NOTIFICATION_REQUEST_CODE, intent,
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_IMMUTABLE
            else PendingIntent.FLAG_UPDATE_CURRENT
        )

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.icon)
            .setContentTitle("Qiblah Finder")
            .setContentText(message)
            .setColor(ContextCompat.getColor(context, R.color.white))
            .setContentIntent(pi)
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setVibrate(longArrayOf(500, 500, 500, 500, 500, 500, 500, 500, 500, 500))
            .setAutoCancel(false)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationCHannel(nm)
            builder.setChannelId(CHANNEL_ID)
        }

        val notif = builder.build()
        nm.notify(24352, notif)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationCHannel(nm: NotificationManager) {
        val channel = NotificationChannel(
            CHANNEL_ID,
            "Qiblah Finder",
            NotificationManager.IMPORTANCE_HIGH
        ).apply {
            enableVibration(true)
            vibrationPattern = longArrayOf(1000, 1000, 1000, 1000, 1000)
        }
        nm.createNotificationChannel(channel)
    }
}