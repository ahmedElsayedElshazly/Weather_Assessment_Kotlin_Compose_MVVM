package com.planradar.weatherassessment.weather.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.planradar.weatherassessment.weather.domain.model.Weather
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherDetailViewModel @Inject constructor(
    private val getCurrentWeatherUseCase: GetCurrentWeatherUseCase,
    private val saveWeatherHistoryUseCase: SaveWeatherHistoryUseCase,
    private val getWeatherHistoryByIdUseCase: GetWeatherHistoryByIdUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(WeatherDetailUiState())
    val uiState: StateFlow<WeatherDetailUiState> = _uiState.asStateFlow()
    
    private var lastCityName: String? = null

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
                        error = throwable.message ?: "Failed to load weather"
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
                        error = throwable.message ?: "Failed to load weather history"
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

