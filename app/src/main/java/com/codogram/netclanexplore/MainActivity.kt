package com.codogram.netclanexplore

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mainlayout: ConstraintLayout
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController


        mainlayout = findViewById(R.id.mainlayout)

        supportFragmentManager.beginTransaction()
            .add(mainlayout.id, SplashFragment())
            .commit()

        Handler(Looper.getMainLooper()).postDelayed({
            supportFragmentManager.beginTransaction()
                .replace(mainlayout.id, WelcomeFragment())
                .commit()
        }, 2000) // Delay of 3 seconds for the splash screen



    }
}

