package com.planradar.weatherassessment.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.planradar.weatherassessment.cities.presentation.screen.CitiesScreen
import com.planradar.weatherassessment.weather.presentation.screen.WeatherDetailScreen
import com.planradar.weatherassessment.weather.presentation.screen.WeatherHistoryScreen

sealed class Screen(val route: String) {
    object Cities : Screen("cities")
    object WeatherDetail : Screen("weather_detail/{cityName}") {
        fun createRoute(cityName: String, historyId: Long? = null) = 
            "weather_detail/$cityName"
    }
    object WeatherHistory : Screen("weather_history/{cityName}") {
        fun createRoute(cityName: String) = "weather_history/$cityName"
    }
}

@Composable
fun AppNavigation(
    navController: NavHostController,
    startDestination: String = Screen.Cities.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Cities.route) {
            CitiesScreen(
                onBackPress = null,
                onNavigateToWeatherDetail = { cityName ->
                    navController.navigate(Screen.WeatherDetail.createRoute(cityName))
                },
                onNavigateToWeatherHistory = { cityName ->
                    navController.navigate(Screen.WeatherHistory.createRoute(cityName))
                }
            )
        }
        
        composable(
            route = Screen.WeatherDetail.route,
            arguments = listOf(
                navArgument("cityName") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val cityName = backStackEntry.arguments?.getString("cityName") ?: ""
            val historyId = navController.previousBackStackEntry?.savedStateHandle?.get<Long>("historyId")
            
            WeatherDetailScreen(
                cityName = cityName,
                onBackPress = { navController.popBackStack() },
                historyId = historyId
            )
        }
        
        composable(
            route = Screen.WeatherHistory.route,
            arguments = listOf(
                navArgument("cityName") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val cityName = backStackEntry.arguments?.getString("cityName") ?: ""
            WeatherHistoryScreen(
                cityName = cityName,
                onBackPress = { navController.popBackStack() },
                onNavigateToWeatherDetail = { cityName, historyId ->
                    if (historyId != null) {
                        navController.currentBackStackEntry?.savedStateHandle?.set("historyId", historyId)
                    }
                    navController.navigate(Screen.WeatherDetail.createRoute(cityName))
                }
            )
        }
    }
}

