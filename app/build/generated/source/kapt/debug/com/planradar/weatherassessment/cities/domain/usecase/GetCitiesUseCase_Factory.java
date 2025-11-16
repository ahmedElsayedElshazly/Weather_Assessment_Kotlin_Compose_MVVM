package com.planradar.weatherassessment.cities.domain.usecase;

import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
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
public final class GetCitiesUseCase_Factory implements Factory<GetCitiesUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public GetCitiesUseCase_Factory(Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public GetCitiesUseCase get() {
    return newInstance(citiesRepositoryProvider.get());
  }

  public static GetCitiesUseCase_Factory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new GetCitiesUseCase_Factory(citiesRepositoryProvider);
  }

  public static GetCitiesUseCase newInstance(CitiesRepository citiesRepository) {
    return new GetCitiesUseCase(citiesRepository);
  }
}
