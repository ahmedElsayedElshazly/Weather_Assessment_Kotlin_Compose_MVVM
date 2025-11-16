package com.planradar.weatherassessment.weather.presentation.viewmodel;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.R;
import com.planradar.weatherassessment.weather.domain.model.Weather;
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrentWeatherUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetCurrentWeatherUseCase;", "saveWeatherHistoryUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/SaveWeatherHistoryUseCase;", "getWeatherHistoryByIdUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryByIdUseCase;", "context", "Landroid/content/Context;", "(Lcom/planradar/weatherassessment/weather/domain/usecase/GetCurrentWeatherUseCase;Lcom/planradar/weatherassessment/weather/domain/usecase/SaveWeatherHistoryUseCase;Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryByIdUseCase;Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherDetailUiState;", "lastCityName", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadWeather", "", "cityName", "loadWeatherFromHistory", "historyId", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class WeatherDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase getCurrentWeatherUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase saveWeatherHistoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase getWeatherHistoryByIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
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
    com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase getWeatherHistoryByIdUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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