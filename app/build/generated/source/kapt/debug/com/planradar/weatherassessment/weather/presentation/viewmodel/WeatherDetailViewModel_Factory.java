package com.planradar.weatherassessment.weather.presentation.viewmodel;

import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class WeatherDetailViewModel_Factory implements Factory<WeatherDetailViewModel> {
  private final Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider;

  private final Provider<SaveWeatherHistoryUseCase> saveWeatherHistoryUseCaseProvider;

  private final Provider<GetWeatherHistoryByIdUseCase> getWeatherHistoryByIdUseCaseProvider;

  public WeatherDetailViewModel_Factory(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider,
      Provider<SaveWeatherHistoryUseCase> saveWeatherHistoryUseCaseProvider,
      Provider<GetWeatherHistoryByIdUseCase> getWeatherHistoryByIdUseCaseProvider) {
    this.getCurrentWeatherUseCaseProvider = getCurrentWeatherUseCaseProvider;
    this.saveWeatherHistoryUseCaseProvider = saveWeatherHistoryUseCaseProvider;
    this.getWeatherHistoryByIdUseCaseProvider = getWeatherHistoryByIdUseCaseProvider;
  }

  @Override
  public WeatherDetailViewModel get() {
    return newInstance(getCurrentWeatherUseCaseProvider.get(), saveWeatherHistoryUseCaseProvider.get(), getWeatherHistoryByIdUseCaseProvider.get());
  }

  public static WeatherDetailViewModel_Factory create(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider,
      Provider<SaveWeatherHistoryUseCase> saveWeatherHistoryUseCaseProvider,
      Provider<GetWeatherHistoryByIdUseCase> getWeatherHistoryByIdUseCaseProvider) {
    return new WeatherDetailViewModel_Factory(getCurrentWeatherUseCaseProvider, saveWeatherHistoryUseCaseProvider, getWeatherHistoryByIdUseCaseProvider);
  }

  public static WeatherDetailViewModel newInstance(
      GetCurrentWeatherUseCase getCurrentWeatherUseCase,
      SaveWeatherHistoryUseCase saveWeatherHistoryUseCase,
      GetWeatherHistoryByIdUseCase getWeatherHistoryByIdUseCase) {
    return new WeatherDetailViewModel(getCurrentWeatherUseCase, saveWeatherHistoryUseCase, getWeatherHistoryByIdUseCase);
  }
}
