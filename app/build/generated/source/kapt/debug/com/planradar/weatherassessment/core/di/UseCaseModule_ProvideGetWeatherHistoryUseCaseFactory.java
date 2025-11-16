package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
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
public final class UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory implements Factory<GetWeatherHistoryUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public GetWeatherHistoryUseCase get() {
    return provideGetWeatherHistoryUseCase(weatherRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory(weatherRepositoryProvider);
  }

  public static GetWeatherHistoryUseCase provideGetWeatherHistoryUseCase(
      WeatherRepository weatherRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetWeatherHistoryUseCase(weatherRepository));
  }
}
