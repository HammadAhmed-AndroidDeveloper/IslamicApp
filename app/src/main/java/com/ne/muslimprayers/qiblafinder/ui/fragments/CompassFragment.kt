package com.ne.muslimprayers.qiblafinder.ui.fragments

import android.content.Context
import android.content.SharedPreferences
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ne.muslimprayers.qiblafinder.utils.CompassEvaluater
import com.ne.muslimprayers.qiblafinder.R
import com.ne.muslimprayers.qiblafinder.interfaces.CompassListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CompassFragment : Fragment(), SensorEventListener, CompassListener {

    //    private var compass: Compass? = null
    private var arrowViewQiblat: ImageView? = null
    private var imageDial: ImageView? = null
    private var currentAzimuth = 0f
    var prefs: SharedPreferences? = null
    var gps: CompassEvaluater? = null
    private var sensorManager: SensorManager? = null
    private var gsensor: Sensor? = null
    private var msensor: Sensor? = null
    private val mGravity = FloatArray(3)
    private val mGeomagnetic = FloatArray(3)
    private val r = FloatArray(9)
    private val I = FloatArray(9)
    private var azimuth = 0f
    private var azimuthFix = 0f

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        sensorManager = requireContext().getSystemService(Context.SENSOR_SERVICE) as SensorManager
        gsensor = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        msensor = sensorManager?.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)

        val view = inflater.inflate(R.layout.fragment_compass, container, false)
        prefs = requireActivity().getSharedPreferences("qibla", AppCompatActivity.MODE_PRIVATE)
        gps = CompassEvaluater(requireContext())
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        arrowViewQiblat = view.findViewById(R.id.main_image_qibla)
        imageDial = view.findViewById(R.id.main_image_dial)
//        arrowViewQiblat?.setVisibility(View.INVISIBLE)
//        arrowViewQiblat?.setVisibility(View.GONE)
//        setupCompass()

        fetch_GPS()
//        compass = Compass(requireContext())
//        val cl = object : CompassListener {
//            override fun onNewAzimuth(azimuth: Float) {
//                adjustGambarDial(azimuth)
//                adjustArrowQiblat(azimuth)
//            }
//        }
        return view
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "start compass")
        start()
    }

    override fun onPause() {
        super.onPause()
        stop()
    }

    override fun onResume() {
        super.onResume()
        start()
    }

    override fun onStop() {
        super.onStop()
        stop()
    }

    private fun start() {
        sensorManager?.registerListener(
            this, gsensor,
            SensorManager.SENSOR_DELAY_GAME
        )
        sensorManager?.registerListener(
            this, msensor,
            SensorManager.SENSOR_DELAY_GAME
        )
    }

    private fun stop() {
        sensorManager?.unregisterListener(this)
    }

    private fun setupCompass() {
//        bearing
        fetch_GPS()
//        compass = Compass(requireContext())
        val cl = object : CompassListener {
            override fun onNewAzimuth(azimuth: Float) {
                adjustGambarDial(azimuth)
                adjustArrowQiblat(azimuth)
            }
        }
//        compass!!.setListener(cl)
    }

    fun adjustGambarDial(azimuth: Float) {
        val an: Animation = RotateAnimation(
            -currentAzimuth,
            -azimuth,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        currentAzimuth = azimuth
        an.duration = 500
        an.repeatCount = 0
        an.fillAfter = true
        imageDial!!.startAnimation(an)
    }

    fun adjustArrowQiblat(azimuth: Float) {
        val QiblaDegree = GetFloat("QiblaDegree")
        val an: Animation = RotateAnimation(
            -currentAzimuth + QiblaDegree,
            -azimuth,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        currentAzimuth = azimuth
        an.duration = 500
        an.repeatCount = 0
        an.fillAfter = true
        arrowViewQiblat!!.startAnimation(an)
        if (QiblaDegree > 0) {
            arrowViewQiblat!!.visibility = View.VISIBLE
        } else {
//            arrowViewQiblat!!.visibility = View.INVISIBLE
//            arrowViewQiblat!!.visibility = View.GONE
        }
    }

//    @get:SuppressLint("MissingPermission")
//    val bearing: Unit
//        get() {
//            fetch_GPS()
//        }

    fun SaveFloat(key: String?, ff: Float?) {
        val edit = prefs!!.edit()
        edit.putFloat(key, ff!!)
        edit.apply()
    }

    fun GetFloat(key: String?): Float {
        return prefs!!.getFloat(key, 0f)
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        fetch_GPS()
//        return true
//    }

    fun fetch_GPS() {
        var result = 0.0
        gps = CompassEvaluater(requireContext())
        if (gps!!.canGetLocation()) {
            val latitude = gps!!.latitude
            val longitude = gps!!.longitude
            Log.e("TAG", "GPS is on")
            val lat_saya = gps!!.latitude
            val lon_saya = gps!!.longitude
            if (lat_saya < 0.001 && lon_saya < 0.001) {
//                arrowViewQiblat!!.visibility = View.INVISIBLE
//                arrowViewQiblat!!.visibility = View.GONE
            } else {
                val longitude2 =
                    39.826209
                val latitude2 =
                    Math.toRadians(21.422507)
                val latitude1 = Math.toRadians(lat_saya)
                val longDiff = Math.toRadians(longitude2 - lon_saya)
                val y = Math.sin(longDiff) * Math.cos(latitude2)
                val x = Math.cos(latitude1) * Math.sin(latitude2) - Math.sin(latitude1) * Math.cos(
                    latitude2
                ) * Math.cos(longDiff)
                result = (Math.toDegrees(Math.atan2(y, x)) + 360) % 360
                val result2 = result.toFloat()
                SaveFloat("QiblaDegree", result2)
                arrowViewQiblat!!.visibility = View.VISIBLE
            }
        } else {
            gps!!.showSettingsAlert()
//            arrowViewQiblat!!.visibility = View.INVISIBLE
//            arrowViewQiblat!!.visibility = View.GONE
        }
    }

    override fun onSensorChanged(event: SensorEvent) {
        val alpha = 0.97f
        synchronized(this) {
            if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
                mGravity[0] = alpha * mGravity[0] + (1 - alpha) * event.values[0]
                mGravity[1] = alpha * mGravity[1] + (1 - alpha) * event.values[1]
                mGravity[2] = alpha * mGravity[2] + (1 - alpha) * event.values[2]
            }
            if (event.sensor.type == Sensor.TYPE_MAGNETIC_FIELD) {
                mGeomagnetic[0] = alpha * mGeomagnetic[0] + (1 - alpha) * event.values[0]
                mGeomagnetic[1] = alpha * mGeomagnetic[1] + (1 - alpha) * event.values[1]
                mGeomagnetic[2] = alpha * mGeomagnetic[2] + (1 - alpha) * event.values[2]
            }
            val success = SensorManager.getRotationMatrix(r, I, mGravity, mGeomagnetic)
            if (success) {
                val orientation = FloatArray(3)
                SensorManager.getOrientation(r, orientation)
                azimuth = Math.toDegrees(orientation[0].toDouble()).toFloat() // orientation
                azimuth = (azimuth + azimuthFix + 360) % 360
                onNewAzimuth(azimuth)
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {}

    companion object {
        private const val TAG = "QiblaFinder"
    }

    override fun onNewAzimuth(azimuth: Float) {
        adjustGambarDial(azimuth)
        adjustArrowQiblat(azimuth)
    }
}