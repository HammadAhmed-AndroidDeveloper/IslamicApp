package com.ne.muslimprayers.qiblafinder.ui.activities

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.github.ybq.android.spinkit.SpinKitView
import com.google.firebase.analytics.FirebaseAnalytics
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.ne.muslimprayers.qiblafinder.R


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var startBtn: AppCompatButton
    private lateinit var spinKit: SpinKitView

    public override fun onCreate(bundle: Bundle?) {

        super.onCreate(bundle)
        supportRequestWindowFeature(1)
        window.setFlags(1024, 1024)
        FirebaseAnalytics.getInstance(this@SplashActivity)
        setContentView(R.layout.activity_splash)
        val decorView = window.decorView

        startBtn = findViewById(R.id.startBtn)
        spinKit = findViewById(R.id.spinKit)

        Handler(Looper.getMainLooper()).postDelayed({
            spinKit.visibility = GONE
            startBtn.visibility = VISIBLE
        }, 3000)

        startBtn.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                Dexter.withContext(this)
                    .withPermissions(
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.POST_NOTIFICATIONS
                    ).withListener(object : MultiplePermissionsListener {
                        override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                            finish()
                        }

                        override fun onPermissionRationaleShouldBeShown(
                            permissions: List<PermissionRequest?>?,
                            token: PermissionToken?
                        ) {
                        }
                    }).check()
            } else {
                Dexter.withContext(this)
                    .withPermissions(
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ).withListener(object : MultiplePermissionsListener {
                        override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                            finish()
                        }

                        override fun onPermissionRationaleShouldBeShown(
                            permissions: List<PermissionRequest?>?,
                            token: PermissionToken?
                        ) {
                        }
                    }).check()
            }
        }
        var uiVisibility = decorView.systemUiVisibility
        uiVisibility = uiVisibility or View.SYSTEM_UI_FLAG_LOW_PROFILE
        uiVisibility = uiVisibility or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        uiVisibility = uiVisibility or View.SYSTEM_UI_FLAG_IMMERSIVE
        uiVisibility = uiVisibility or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.systemUiVisibility = uiVisibility

    }

}