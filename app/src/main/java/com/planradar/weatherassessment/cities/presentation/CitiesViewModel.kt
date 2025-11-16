package com.planradar.weatherassessment.cities.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitiesViewModel @Inject constructor(
    private val getCitiesUseCase: GetCitiesUseCase,
    private val addCityUseCase: AddCityUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(CitiesUiState())
    val uiState: StateFlow<CitiesUiState> = _uiState.asStateFlow()

    init {
        loadCities()
    }

    fun loadCities() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            try {
                val cities = getCitiesUseCase()
                _uiState.value = _uiState.value.copy(
                    cities = cities,
                    isLoading = false,
                    error = null
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Failed to load cities"
                )
            }
        }
    }

    fun addCity(cityName: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isAddingCity = true)
            val result = addCityUseCase(cityName)
            when (result) {
                is com.planradar.weatherassessment.cities.domain.usecase.AddCityResult.Success -> {
                    _uiState.value = _uiState.value.copy(
                        isAddingCity = false,
                        showAddDialog = false,
                        error = null
                    )
                    loadCities() // Refresh the list
                }
                is com.planradar.weatherassessment.cities.domain.usecase.AddCityResult.Error -> {
                    _uiState.value = _uiState.value.copy(
                        isAddingCity = false,
                        error = result.message
                    )
                }
            }
        }
    }

    fun showAddDialog() {
        _uiState.value = _uiState.value.copy(showAddDialog = true)
    }

    fun dismissAddDialog() {
        _uiState.value = _uiState.value.copy(showAddDialog = false, error = null)
    }

    fun dismissError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    fun updateSearchText(text: String) {
        _uiState.value = _uiState.value.copy(searchText = text)
    }
}

data class CitiesUiState(
    val cities: List<CityEntity> = emptyList(),
    val searchText: String = "",
    val isLoading: Boolean = false,
    val isAddingCity: Boolean = false,
    val showAddDialog: Boolean = false,
    val error: String? = null
) {
    val filteredCities: List<CityEntity>
        get() = if (searchText.isBlank()) {
            cities
        } else {
            cities.filter { it.name.contains(searchText, ignoreCase = true) }
        }
}

