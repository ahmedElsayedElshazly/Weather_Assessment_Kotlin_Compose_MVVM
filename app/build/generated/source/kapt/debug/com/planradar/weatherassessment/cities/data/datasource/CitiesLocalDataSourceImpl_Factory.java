package com.planradar.weatherassessment.cities.data.datasource;

import com.planradar.weatherassessment.cities.data.CitiesDao;
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
public final class CitiesLocalDataSourceImpl_Factory implements Factory<CitiesLocalDataSourceImpl> {
  private final Provider<CitiesDao> citiesDaoProvider;

  public CitiesLocalDataSourceImpl_Factory(Provider<CitiesDao> citiesDaoProvider) {
    this.citiesDaoProvider = citiesDaoProvider;
  }

  @Override
  public CitiesLocalDataSourceImpl get() {
    return newInstance(citiesDaoProvider.get());
  }

  public static CitiesLocalDataSourceImpl_Factory create(Provider<CitiesDao> citiesDaoProvider) {
    return new CitiesLocalDataSourceImpl_Factory(citiesDaoProvider);
  }

  public static CitiesLocalDataSourceImpl newInstance(CitiesDao citiesDao) {
    return new CitiesLocalDataSourceImpl(citiesDao);
  }
}
