package com.planradar.weatherassessment.cities.presentation;

import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.cities.data.model.CityEntity;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/planradar/weatherassessment/cities/presentation/CitiesViewModel;", "Landroidx/lifecycle/ViewModel;", "getCitiesUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/GetCitiesUseCase;", "addCityUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/AddCityUseCase;", "(Lcom/planradar/weatherassessment/cities/domain/usecase/GetCitiesUseCase;Lcom/planradar/weatherassessment/cities/domain/usecase/AddCityUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/planradar/weatherassessment/cities/presentation/CitiesUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addCity", "", "cityName", "", "dismissAddDialog", "dismissError", "loadCities", "showAddDialog", "updateSearchText", "text", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CitiesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase getCitiesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase addCityUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.planradar.weatherassessment.cities.presentation.CitiesUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.cities.presentation.CitiesUiState> uiState = null;
    
    @javax.inject.Inject()
    public CitiesViewModel(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase getCitiesUseCase, @org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase addCityUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.cities.presentation.CitiesUiState> getUiState() {
        return null;
    }
    
    public final void loadCities() {
    }
    
    public final void addCity(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    public final void showAddDialog() {
    }
    
    public final void dismissAddDialog() {
    }
    
    public final void dismissError() {
    }
    
    public final void updateSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}