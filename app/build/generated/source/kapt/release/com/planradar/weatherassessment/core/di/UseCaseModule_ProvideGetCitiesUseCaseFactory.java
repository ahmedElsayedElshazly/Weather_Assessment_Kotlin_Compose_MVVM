package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
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
public final class UseCaseModule_ProvideGetCitiesUseCaseFactory implements Factory<GetCitiesUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public UseCaseModule_ProvideGetCitiesUseCaseFactory(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public GetCitiesUseCase get() {
    return provideGetCitiesUseCase(citiesRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetCitiesUseCaseFactory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new UseCaseModule_ProvideGetCitiesUseCaseFactory(citiesRepositoryProvider);
  }

  public static GetCitiesUseCase provideGetCitiesUseCase(CitiesRepository citiesRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetCitiesUseCase(citiesRepository));
  }
}
