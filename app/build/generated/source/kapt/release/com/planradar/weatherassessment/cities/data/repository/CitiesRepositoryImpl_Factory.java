package com.planradar.weatherassessment.cities.data.repository;

import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource;
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
public final class CitiesRepositoryImpl_Factory implements Factory<CitiesRepositoryImpl> {
  private final Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider;

  public CitiesRepositoryImpl_Factory(
      Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider) {
    this.citiesLocalDataSourceProvider = citiesLocalDataSourceProvider;
  }

  @Override
  public CitiesRepositoryImpl get() {
    return newInstance(citiesLocalDataSourceProvider.get());
  }

  public static CitiesRepositoryImpl_Factory create(
      Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider) {
    return new CitiesRepositoryImpl_Factory(citiesLocalDataSourceProvider);
  }

  public static CitiesRepositoryImpl newInstance(CitiesLocalDataSource citiesLocalDataSource) {
    return new CitiesRepositoryImpl(citiesLocalDataSource);
  }
}
