package com.planradar.weatherassessment.weather.presentation.viewmodel;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.R;
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "getWeatherHistoryUseCase", "Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryUseCase;", "context", "Landroid/content/Context;", "(Lcom/planradar/weatherassessment/weather/domain/usecase/GetWeatherHistoryUseCase;Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherHistoryUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadWeatherHistory", "", "cityName", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class WeatherHistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase getWeatherHistoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryUiState> uiState = null;
    
    @javax.inject.Inject()
    public WeatherHistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase getWeatherHistoryUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryUiState> getUiState() {
        return null;
    }
    
    public final void loadWeatherHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
}