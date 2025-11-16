package com.planradar.weatherassessment

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.planradar.weatherassessment.core.navigation.AppNavigation
import com.planradar.weatherassessment.theme.WeatherAppAssessmentTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        window.statusBarColor = android.graphics.Color.parseColor("#2388C7")
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
            windowInsetsController.isAppearanceLightStatusBars = false
        }
        
        setContent {
            WeatherAppAssessmentTheme {
                val navController = rememberNavController()
                AppNavigation(navController = navController)
            }
        }
    }
}