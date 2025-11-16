package com.planradar.weatherassessment.weather.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.core.ui.BaseScreen
import com.planradar.weatherassessment.core.ui.ErrorView
import com.planradar.weatherassessment.core.ui.LoadingIndicator
import com.planradar.weatherassessment.weather.presentation.ui.WeatherHistoryItem
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel

@Composable
fun WeatherHistoryScreen(
    cityName: String,
    viewModel: WeatherHistoryViewModel = hiltViewModel(),
    onBackPress: () -> Unit,
    onNavigateToWeatherDetail: ((String, Long?) -> Unit)? = null
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(cityName) {
        viewModel.loadWeatherHistory(cityName)
    }

    BaseScreen(
        headerTitle = "$cityName ${stringResource(R.string.historical)}",
        onBackPress = onBackPress,
        showBackButton = true,
        contentPaddingTop = 150.dp
    ) {
        when {
            uiState.isLoading -> {
                LoadingIndicator()
            }
            uiState.error != null -> {
                ErrorView(
                    message = uiState.error ?: stringResource(R.string.unknown_error),
                    onRetry = { viewModel.loadWeatherHistory(cityName) }
                )
            }
            uiState.weatherHistory.isEmpty() -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.no_record_added_yet),
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    )
                }
            }
            else -> {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .navigationBarsPadding(),
                    contentPadding = PaddingValues(
                        top = 8.dp,
                        bottom = 8.dp
                    )
                ) {
                    items(uiState.weatherHistory) { historyItem ->
                        WeatherHistoryItem(
                            weatherHistory = historyItem,
                            onClick = {
                                onNavigateToWeatherDetail?.invoke(historyItem.cityName, historyItem.id)
                            }
                        )
                    }
                }
            }
        }
    }
}

