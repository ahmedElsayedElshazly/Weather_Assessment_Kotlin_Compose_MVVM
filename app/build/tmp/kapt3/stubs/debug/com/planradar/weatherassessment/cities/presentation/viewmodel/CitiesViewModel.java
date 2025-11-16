package com.planradar.weatherassessment.cities.presentation.viewmodel;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.R;
import com.planradar.weatherassessment.cities.data.model.CityEntity;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/planradar/weatherassessment/cities/presentation/viewmodel/CitiesViewModel;", "Landroidx/lifecycle/ViewModel;", "getCitiesUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/GetCitiesUseCase;", "addCityUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/AddCityUseCase;", "context", "Landroid/content/Context;", "(Lcom/planradar/weatherassessment/cities/domain/usecase/GetCitiesUseCase;Lcom/planradar/weatherassessment/cities/domain/usecase/AddCityUseCase;Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/planradar/weatherassessment/cities/presentation/viewmodel/CitiesUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addCity", "", "cityName", "", "dismissAddDialog", "loadCities", "showAddDialog", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CitiesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase getCitiesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase addCityUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesUiState> uiState = null;
    
    @javax.inject.Inject()
    public CitiesViewModel(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase getCitiesUseCase, @org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase addCityUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesUiState> getUiState() {
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
}