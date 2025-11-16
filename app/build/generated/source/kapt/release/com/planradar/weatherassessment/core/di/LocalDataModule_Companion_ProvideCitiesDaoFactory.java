package com.planradar.weatherassessment.core.di;

import com.planradar.weatherassessment.cities.data.CitiesDao;
import com.planradar.weatherassessment.core.db.AppDataBase;
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
public final class LocalDataModule_Companion_ProvideCitiesDaoFactory implements Factory<CitiesDao> {
  private final Provider<AppDataBase> appDataBaseProvider;

  public LocalDataModule_Companion_ProvideCitiesDaoFactory(
      Provider<AppDataBase> appDataBaseProvider) {
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public CitiesDao get() {
    return provideCitiesDao(appDataBaseProvider.get());
  }

  public static LocalDataModule_Companion_ProvideCitiesDaoFactory create(
      Provider<AppDataBase> appDataBaseProvider) {
    return new LocalDataModule_Companion_ProvideCitiesDaoFactory(appDataBaseProvider);
  }

  public static CitiesDao provideCitiesDao(AppDataBase appDataBase) {
    return Preconditions.checkNotNullFromProvides(LocalDataModule.Companion.provideCitiesDao(appDataBase));
  }
}
