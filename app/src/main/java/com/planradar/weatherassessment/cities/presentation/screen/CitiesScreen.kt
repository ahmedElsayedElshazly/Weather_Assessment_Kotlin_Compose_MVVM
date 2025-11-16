package com.planradar.weatherassessment.cities.presentation.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.cities.presentation.ui.AddCityDialog
import com.planradar.weatherassessment.cities.presentation.ui.AddCityFab
import com.planradar.weatherassessment.cities.presentation.ui.CitiesContent
import com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel
import com.planradar.weatherassessment.core.ui.BaseScreen

@Composable
fun CitiesScreen(
    viewModel: CitiesViewModel = hiltViewModel(),
    onBackPress: (() -> Unit)? = null,
    onNavigateToWeatherDetail: ((String) -> Unit)? = null,
    onNavigateToWeatherHistory: ((String) -> Unit)? = null
) {
    val context = LocalContext.current

    val handleBackPress: () -> Unit = onBackPress ?: {
        if (context is android.app.Activity) {
            context.finish()
        }
    }

    BackHandler(onBack = handleBackPress)
    val uiState by viewModel.uiState.collectAsState()

    BaseScreen(
        headerTitle = stringResource(R.string.cities),
        onBackPress = handleBackPress,
        showBackButton = false,
        contentPaddingTop = 150.dp
    ) {

        CitiesContent(
            cities = uiState.cities,
            isLoading = uiState.isLoading,
            onCityClick = { city ->
                onNavigateToWeatherDetail?.invoke(city.name)
            },
            onCityInfoClick = { city ->
                onNavigateToWeatherHistory?.invoke(city.name)
            },
            modifier = Modifier.fillMaxSize()
        )

        AddCityFab(
            onClick = { viewModel.showAddDialog() },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .navigationBarsPadding()
                .padding(24.dp)
        )
    }

    if (uiState.showAddDialog) {
        AddCityDialog(
            onDismiss = { viewModel.dismissAddDialog() },
            onConfirm = { cityName ->
                viewModel.addCity(cityName)
            },
            isLoading = uiState.isAddingCity,
            error = uiState.error
        )
    }
}

