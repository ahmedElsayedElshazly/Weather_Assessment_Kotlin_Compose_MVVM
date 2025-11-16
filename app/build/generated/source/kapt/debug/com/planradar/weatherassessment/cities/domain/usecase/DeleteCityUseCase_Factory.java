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
public final class DeleteCityUseCase_Factory implements Factory<DeleteCityUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public DeleteCityUseCase_Factory(Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public DeleteCityUseCase get() {
    return newInstance(citiesRepositoryProvider.get());
  }

  public static DeleteCityUseCase_Factory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new DeleteCityUseCase_Factory(citiesRepositoryProvider);
  }

  public static DeleteCityUseCase newInstance(CitiesRepository citiesRepository) {
    return new DeleteCityUseCase(citiesRepository);
  }
}
