package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory implements Factory<SaveWeatherHistoryUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public SaveWeatherHistoryUseCase get() {
    return provideSaveWeatherHistoryUseCase(weatherRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory(weatherRepositoryProvider);
  }

  public static SaveWeatherHistoryUseCase provideSaveWeatherHistoryUseCase(
      WeatherRepository weatherRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideSaveWeatherHistoryUseCase(weatherRepository));
  }
}
