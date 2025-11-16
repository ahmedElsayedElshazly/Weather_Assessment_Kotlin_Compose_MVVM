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
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/planradar/weatherassessment/weather/presentation/viewmodel/WeatherDetailUiState;", "", "weather", "Lcom/planradar/weatherassessment/weather/domain/model/Weather;", "isLoading", "", "error", "", "timestamp", "", "(Lcom/planradar/weatherassessment/weather/domain/model/Weather;ZLjava/lang/String;J)V", "getError", "()Ljava/lang/String;", "()Z", "getTimestamp", "()J", "getWeather", "()Lcom/planradar/weatherassessment/weather/domain/model/Weather;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class WeatherDetailUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.planradar.weatherassessment.weather.domain.model.Weather weather = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final long timestamp = 0L;
    
    public WeatherDetailUiState(@org.jetbrains.annotations.Nullable()
    com.planradar.weatherassessment.weather.domain.model.Weather weather, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.planradar.weatherassessment.weather.domain.model.Weather getWeather() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public WeatherDetailUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.planradar.weatherassessment.weather.domain.model.Weather component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailUiState copy(@org.jetbrains.annotations.Nullable()
    com.planradar.weatherassessment.weather.domain.model.Weather weather, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, long timestamp) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}