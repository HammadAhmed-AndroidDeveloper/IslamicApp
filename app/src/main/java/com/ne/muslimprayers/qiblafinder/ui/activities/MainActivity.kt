package com.ne.muslimprayers.qiblafinder.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ne.muslimprayers.qiblafinder.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val navView: BottomNavigationView = findViewById(R.id.bottom_nav_view)
        navView.setupWithNavController(navController)

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    navController.navigate(R.id.homeFragment)
                }

                R.id.quran -> {
                    Toast.makeText(this@MainActivity, "Coming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.quranFragment)
                }

                R.id.hadith -> {
                    Toast.makeText(this@MainActivity, "Coming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.hadithFragment)
                }

                R.id.ibadat -> {
                    Toast.makeText(this@MainActivity, "Coming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.ibadatFragment)
                }

                R.id.more -> {
                    Toast.makeText(this@MainActivity, "Coming Soon", Toast.LENGTH_SHORT).show()
//                    navController.navigate(R.id.moreFrag)
                }
            }
            true
        }
    }
}