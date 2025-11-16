package com.planradar.weatherassessment.weather.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherHistoryViewModel @Inject constructor(
    private val getWeatherHistoryUseCase: GetWeatherHistoryUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(WeatherHistoryUiState())
    val uiState: StateFlow<WeatherHistoryUiState> = _uiState.asStateFlow()

    fun loadWeatherHistory(cityName: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null
            )
            
            getWeatherHistoryUseCase(cityName)
                .catch { throwable ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = throwable.message ?: "Failed to load weather history"
                    )
                }
                .collect { historyList ->
                    _uiState.value = _uiState.value.copy(
                        weatherHistory = historyList,
                        isLoading = false,
                        error = null
                    )
                }
        }
    }
}

data class WeatherHistoryUiState(
    val weatherHistory: List<WeatherHistory> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)

