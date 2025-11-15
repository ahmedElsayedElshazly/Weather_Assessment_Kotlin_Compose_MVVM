package com.planradar.weatherassessment.core.di;

import android.app.Application;
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
public final class DataBaseModule_ProvideAppDataBaseFactory implements Factory<AppDataBase> {
  private final DataBaseModule module;

  private final Provider<Application> appProvider;

  public DataBaseModule_ProvideAppDataBaseFactory(DataBaseModule module,
      Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public AppDataBase get() {
    return provideAppDataBase(module, appProvider.get());
  }

  public static DataBaseModule_ProvideAppDataBaseFactory create(DataBaseModule module,
      Provider<Application> appProvider) {
    return new DataBaseModule_ProvideAppDataBaseFactory(module, appProvider);
  }

  public static AppDataBase provideAppDataBase(DataBaseModule instance, Application app) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDataBase(app));
  }
}
