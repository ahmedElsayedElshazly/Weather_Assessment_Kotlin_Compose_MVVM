package com.planradar.weatherassessment.weather.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.core.ui.BaseScreen
import com.planradar.weatherassessment.core.ui.ErrorView
import com.planradar.weatherassessment.core.ui.LoadingIndicator
import com.planradar.weatherassessment.weather.presentation.ui.WeatherCard
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WeatherDetailScreen(
    cityName: String,
    viewModel: WeatherDetailViewModel = hiltViewModel(),
    onBackPress: () -> Unit,
    historyId: Long? = null
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(historyId ?: cityName) {
        if (historyId != null) {
            viewModel.loadWeatherFromHistory(historyId)
        } else {
            viewModel.loadWeather(cityName)
        }
    }

    BaseScreen(
        headerTitle = cityName,
        onBackPress = onBackPress,
        showBackButton = true,
        contentPaddingTop = 100.dp
    ) {
        when {
            uiState.isLoading -> {
                LoadingIndicator()
            }

            uiState.error != null -> {
                ErrorView(
                    message = uiState.error ?: stringResource(R.string.unknown_error),
                    onRetry = { viewModel.loadWeather(cityName) }
                )
            }

            uiState.weather != null -> {
                val weather = uiState.weather!!
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .navigationBarsPadding()
                        .padding(vertical = 0.dp, horizontal = 32.dp)
                ) {
                    WeatherCard(weather = weather)

                    Spacer(modifier = Modifier.weight(1f))

                    if (uiState.timestamp > 0) {
                        Text(
                            text = stringResource(
                                R.string.weather_info_received,
                                weather.cityName,
                                formatTimestamp(uiState.timestamp)
                            ),
                            style = MaterialTheme.typography.bodySmall.copy(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                lineHeight = 16.sp,
                                color = Color(0xFF3D4548)
                            ),
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 20.dp)
                        )
                    }
                }
            }
        }
    }
}

private fun formatTimestamp(timestamp: Long): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy - HH:mm", Locale.getDefault())
    return dateFormat.format(Date(timestamp))
}

