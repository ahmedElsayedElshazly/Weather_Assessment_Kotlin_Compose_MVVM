package com.planradar.weatherassessment.core.navigation;

import androidx.compose.runtime.Composable;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/planradar/weatherassessment/core/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Cities", "WeatherDetail", "WeatherHistory", "Lcom/planradar/weatherassessment/core/navigation/Screen$Cities;", "Lcom/planradar/weatherassessment/core/navigation/Screen$WeatherDetail;", "Lcom/planradar/weatherassessment/core/navigation/Screen$WeatherHistory;", "app_release"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/planradar/weatherassessment/core/navigation/Screen$Cities;", "Lcom/planradar/weatherassessment/core/navigation/Screen;", "()V", "app_release"})
    public static final class Cities extends com.planradar.weatherassessment.core.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.planradar.weatherassessment.core.navigation.Screen.Cities INSTANCE = null;
        
        private Cities() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/planradar/weatherassessment/core/navigation/Screen$WeatherDetail;", "Lcom/planradar/weatherassessment/core/navigation/Screen;", "()V", "createRoute", "", "cityName", "historyId", "", "(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "app_release"})
    public static final class WeatherDetail extends com.planradar.weatherassessment.core.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.planradar.weatherassessment.core.navigation.Screen.WeatherDetail INSTANCE = null;
        
        private WeatherDetail() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String cityName, @org.jetbrains.annotations.Nullable()
        java.lang.Long historyId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/planradar/weatherassessment/core/navigation/Screen$WeatherHistory;", "Lcom/planradar/weatherassessment/core/navigation/Screen;", "()V", "createRoute", "", "cityName", "app_release"})
    public static final class WeatherHistory extends com.planradar.weatherassessment.core.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.planradar.weatherassessment.core.navigation.Screen.WeatherHistory INSTANCE = null;
        
        private WeatherHistory() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String cityName) {
            return null;
        }
    }
}