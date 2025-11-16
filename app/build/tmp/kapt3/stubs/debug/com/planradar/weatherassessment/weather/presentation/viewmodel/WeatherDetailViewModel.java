package com.planradar.weatherassessment.weather.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.weather.domain.model.Weather;
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrentWeatherUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetCurrentWeatherUseCase;", "saveWeatherHistoryUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/SaveWeatherHistoryUseCase;", "getWeatherHistoryByIdUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryByIdUseCase;", "(Lcom/planradar/weatherassessment/weather/domain/usecase/GetCurrentWeatherUseCase;Lcom/planradar/weatherassessment/weather/domain/usecase/SaveWeatherHistoryUseCase;Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryByIdUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherDetailUiState;", "lastCityName", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadWeather", "", "cityName", "loadWeatherFromHistory", "historyId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class WeatherDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase getCurrentWeatherUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase saveWeatherHistoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase getWeatherHistoryByIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailUiState> uiState = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastCityName;
    
    @javax.inject.Inject()
    public WeatherDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase getCurrentWeatherUseCase, @org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase saveWeatherHistoryUseCase, @org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase getWeatherHistoryByIdUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailUiState> getUiState() {
        return null;
    }
    
    public final void loadWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    public final void loadWeatherFromHistory(long historyId) {
    }
}