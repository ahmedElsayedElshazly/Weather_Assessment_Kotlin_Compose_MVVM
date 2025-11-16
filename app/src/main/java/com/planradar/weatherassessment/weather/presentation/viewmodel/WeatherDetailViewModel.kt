package com.planradar.weatherassessment.weather.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject

@HiltViewModel
class WeatherDetailViewModel @Inject constructor(
    private val getCurrentWeatherUseCase: GetCurrentWeatherUseCase,
    private val saveWeatherHistoryUseCase: SaveWeatherHistoryUseCase,
    private val getWeatherHistoryByIdUseCase: GetWeatherHistoryByIdUseCase,
    @ApplicationContext private val context: Context
) : ViewModel() {

    private val _uiState = MutableStateFlow(WeatherDetailUiState())
    val uiState: StateFlow<WeatherDetailUiState> = _uiState.asStateFlow()
    
    private var lastCityName: String? = null
    
    private fun isNetworkError(throwable: Throwable): Boolean {
        return throwable is IOException ||
                throwable is SocketTimeoutException ||
                throwable is UnknownHostException ||
                throwable is ConnectException ||
                throwable.cause is IOException ||
                throwable.cause is SocketTimeoutException ||
                throwable.cause is UnknownHostException ||
                throwable.cause is ConnectException
    }
    
    private fun getErrorMessage(throwable: Throwable, defaultMessage: String): String {
        return if (isNetworkError(throwable)) {
            context.getString(R.string.no_internet_access)
        } else {
            throwable.message ?: defaultMessage
        }
    }

    fun loadWeather(cityName: String) {
        if (lastCityName == cityName && _uiState.value.weather != null) {
            return
        }
        
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null
            )
            
            lastCityName = cityName
            
            getCurrentWeatherUseCase(cityName)
                .onSuccess { weather ->
                    saveWeatherHistoryUseCase(weather, cityName)
                        .onFailure {
                        }
                    
                    _uiState.value = _uiState.value.copy(
                        weather = weather,
                        isLoading = false,
                        error = null,
                        timestamp = System.currentTimeMillis()
                    )
                }
                .onFailure { throwable ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = getErrorMessage(throwable, context.getString(R.string.failed_to_load_weather))
                    )
                }
        }
    }
    
    fun loadWeatherFromHistory(historyId: Long) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null
            )
            
            getWeatherHistoryByIdUseCase(historyId)
                .onSuccess { weatherHistory ->
                    lastCityName = weatherHistory.cityName
                    
                    val weather = Weather(
                        cityName = weatherHistory.cityName,
                        description = weatherHistory.description,
                        temperature = weatherHistory.temperature,
                        humidity = weatherHistory.humidity,
                        windSpeed = weatherHistory.windSpeed,
                        iconId = weatherHistory.iconId
                    )
                    
                    _uiState.value = _uiState.value.copy(
                        weather = weather,
                        isLoading = false,
                        error = null,
                        timestamp = weatherHistory.timestamp
                    )
                }
                .onFailure { throwable ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = throwable.message ?: context.getString(R.string.failed_to_load_weather_history)
                    )
                }
        }
    }
}

data class WeatherDetailUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
    val timestamp: Long = 0L
)

