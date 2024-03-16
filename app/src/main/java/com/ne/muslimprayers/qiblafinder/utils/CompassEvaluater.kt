package com.ne.muslimprayers.qiblafinder.utils

import android.Manifest
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import com.ne.muslimprayers.qiblafinder.R

class CompassEvaluater(private val context: Context) : Service(), LocationListener {

    private var isGPSEnabled = false
    private var isNetworkEnabled = false
    private var canGetLocation = false

    private val UPDATE_AFTER: Long = 100
    private val UPDATER = (1000 * 60 * 1).toLong()

    @JvmField
    var location: Location? = null

    @JvmField
    var latitude = 0.0

    @JvmField
    var longitude = 0.0

    private var locationManager: LocationManager? = null

    init {
        getAcutalLocation()
    }

    private fun getAcutalLocation(): Location? {
        try {
            locationManager = context.getSystemService(LOCATION_SERVICE) as LocationManager
            isGPSEnabled = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
            isNetworkEnabled = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
            if (isGPSEnabled && isNetworkEnabled) {

                canGetLocation = true

                if (ActivityCompat.checkSelfPermission(
                        this, Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this, Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    locationManager!!.requestLocationUpdates(
                        LocationManager.NETWORK_PROVIDER,
                        UPDATER,
                        UPDATE_AFTER.toFloat(),
                        this
                    )
                    if (locationManager != null) {
                        location =
                            locationManager!!.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
                        if (location != null) {
                            latitude = location!!.latitude
                            longitude = location!!.longitude
                        }
                    }
                }

                if (location == null) {
                    locationManager!!.requestLocationUpdates(
                        LocationManager.GPS_PROVIDER,
                        UPDATER,
                        UPDATE_AFTER.toFloat(),
                        this
                    )
                    Log.d("GPS Enabled", "GPS Enabled")
                    if (locationManager != null) {
                        location =
                            locationManager!!.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                        if (location != null) {
                            latitude = location!!.latitude
                            longitude = location!!.longitude
                        }
                    }
                }


            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return location
    }

    fun canGetLocation(): Boolean {
        return canGetLocation
    }

    fun showSettingsAlert() {
        val alertDialog = AlertDialog.Builder(context, R.style.AlertDialogCustom)
        alertDialog.setTitle(context.resources.getString(R.string.gps_settings_title))
        alertDialog.setMessage(context.resources.getString(R.string.gps_settings_text))
        alertDialog.setPositiveButton(context.resources.getString(R.string.allow)) { _, _ ->
            val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
            context.startActivity(intent)
        }
        alertDialog.setNegativeButton(context.resources.getString(R.string.leave)) { dialog, _ -> dialog.cancel() }
        alertDialog.show()
    }

    override fun onLocationChanged(location: Location) {
    }

    override fun onProviderDisabled(provider: String) {
    }

    override fun onProviderEnabled(provider: String) {
    }

    override fun onStatusChanged(provider: String, status: Int, extras: Bundle) {
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

}