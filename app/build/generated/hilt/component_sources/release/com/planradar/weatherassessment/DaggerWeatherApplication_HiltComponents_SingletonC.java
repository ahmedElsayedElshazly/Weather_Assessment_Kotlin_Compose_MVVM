package com.planradar.weatherassessment;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.planradar.weatherassessment.cities.data.CitiesDao;
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSource;
import com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSourceImpl;
import com.planradar.weatherassessment.cities.data.repository.CitiesRepositoryImpl;
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase;
import com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase;
import com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel;
import com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel_HiltModules;
import com.planradar.weatherassessment.core.api.ApiService;
import com.planradar.weatherassessment.core.db.AppDataBase;
import com.planradar.weatherassessment.core.di.DataBaseModule;
import com.planradar.weatherassessment.core.di.DataBaseModule_ProvideAppDataBaseFactory;
import com.planradar.weatherassessment.core.di.LocalDataModule_Companion_ProvideCitiesDaoFactory;
import com.planradar.weatherassessment.core.di.LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory;
import com.planradar.weatherassessment.core.di.NetModule;
import com.planradar.weatherassessment.core.di.NetModule_ProvideApiServiceFactory;
import com.planradar.weatherassessment.core.di.NetModule_ProvideOkHttpClientFactory;
import com.planradar.weatherassessment.core.di.NetModule_ProvideRetrofitFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideAddCityUseCaseFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideGetCitiesUseCaseFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory;
import com.planradar.weatherassessment.core.di.UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSource;
import com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSourceImpl;
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSource;
import com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSourceImpl;
import com.planradar.weatherassessment.weather.data.repository.WeatherRepositoryImpl;
import com.planradar.weatherassessment.weather.domain.repository.WeatherRepository;
import com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase;
import com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase;
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel;
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel_HiltModules;
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel;
import com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel_HiltModules;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.IdentifierNameString;
import dagger.internal.KeepFieldType;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class DaggerWeatherApplication_HiltComponents_SingletonC {
  private DaggerWeatherApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataBaseModule dataBaseModule;

    private NetModule netModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      this.dataBaseModule = Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    public Builder netModule(NetModule netModule) {
      this.netModule = Preconditions.checkNotNull(netModule);
      return this;
    }

    public WeatherApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataBaseModule == null) {
        this.dataBaseModule = new DataBaseModule();
      }
      if (netModule == null) {
        this.netModule = new NetModule();
      }
      return new SingletonCImpl(applicationContextModule, dataBaseModule, netModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements WeatherApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements WeatherApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements WeatherApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements WeatherApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements WeatherApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements WeatherApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements WeatherApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends WeatherApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends WeatherApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends WeatherApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends WeatherApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(3).put(LazyClassKeyProvider.com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel, CitiesViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel, WeatherDetailViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel, WeatherHistoryViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel = "com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel";

      static String com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel = "com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel";

      static String com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel = "com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel";

      @KeepFieldType
      CitiesViewModel com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel2;

      @KeepFieldType
      WeatherHistoryViewModel com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel2;

      @KeepFieldType
      WeatherDetailViewModel com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel2;
    }
  }

  private static final class ViewModelCImpl extends WeatherApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<CitiesViewModel> citiesViewModelProvider;

    private Provider<WeatherDetailViewModel> weatherDetailViewModelProvider;

    private Provider<WeatherHistoryViewModel> weatherHistoryViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.citiesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.weatherDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.weatherHistoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(3).put(LazyClassKeyProvider.com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel, ((Provider) citiesViewModelProvider)).put(LazyClassKeyProvider.com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel, ((Provider) weatherDetailViewModelProvider)).put(LazyClassKeyProvider.com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel, ((Provider) weatherHistoryViewModelProvider)).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel = "com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel";

      static String com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel = "com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel";

      static String com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel = "com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel";

      @KeepFieldType
      CitiesViewModel com_planradar_weatherassessment_cities_presentation_viewmodel_CitiesViewModel2;

      @KeepFieldType
      WeatherHistoryViewModel com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherHistoryViewModel2;

      @KeepFieldType
      WeatherDetailViewModel com_planradar_weatherassessment_weather_presentation_viewmodel_WeatherDetailViewModel2;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.planradar.weatherassessment.cities.presentation.viewmodel.CitiesViewModel 
          return (T) new CitiesViewModel(singletonCImpl.provideGetCitiesUseCaseProvider.get(), singletonCImpl.provideAddCityUseCaseProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherDetailViewModel 
          return (T) new WeatherDetailViewModel(singletonCImpl.provideGetCurrentWeatherUseCaseProvider.get(), singletonCImpl.provideSaveWeatherHistoryUseCaseProvider.get(), singletonCImpl.provideGetWeatherHistoryByIdUseCaseProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // com.planradar.weatherassessment.weather.presentation.viewmodel.WeatherHistoryViewModel 
          return (T) new WeatherHistoryViewModel(singletonCImpl.provideGetWeatherHistoryUseCaseProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends WeatherApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends WeatherApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends WeatherApplication_HiltComponents.SingletonC {
    private final DataBaseModule dataBaseModule;

    private final ApplicationContextModule applicationContextModule;

    private final NetModule netModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AppDataBase> provideAppDataBaseProvider;

    private Provider<CitiesDao> provideCitiesDaoProvider;

    private Provider<CitiesLocalDataSourceImpl> citiesLocalDataSourceImplProvider;

    private Provider<CitiesLocalDataSource> bindCitiesLocalDataSourceProvider;

    private Provider<CitiesRepositoryImpl> citiesRepositoryImplProvider;

    private Provider<CitiesRepository> bindCitiesRepositoryProvider;

    private Provider<GetCitiesUseCase> provideGetCitiesUseCaseProvider;

    private Provider<AddCityUseCase> provideAddCityUseCaseProvider;

    private Provider<OkHttpClient> provideOkHttpClientProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<ApiService> provideApiServiceProvider;

    private Provider<WeatherRemoteDataSourceImpl> weatherRemoteDataSourceImplProvider;

    private Provider<WeatherRemoteDataSource> bindWeatherRemoteDataSourceProvider;

    private Provider<WeatherHistoryDao> provideWeatherHistoryDaoProvider;

    private Provider<WeatherHistoryLocalDataSourceImpl> weatherHistoryLocalDataSourceImplProvider;

    private Provider<WeatherHistoryLocalDataSource> bindWeatherHistoryLocalDataSourceProvider;

    private Provider<WeatherRepositoryImpl> weatherRepositoryImplProvider;

    private Provider<WeatherRepository> bindWeatherRepositoryProvider;

    private Provider<GetCurrentWeatherUseCase> provideGetCurrentWeatherUseCaseProvider;

    private Provider<SaveWeatherHistoryUseCase> provideSaveWeatherHistoryUseCaseProvider;

    private Provider<GetWeatherHistoryByIdUseCase> provideGetWeatherHistoryByIdUseCaseProvider;

    private Provider<GetWeatherHistoryUseCase> provideGetWeatherHistoryUseCaseProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        DataBaseModule dataBaseModuleParam, NetModule netModuleParam) {
      this.dataBaseModule = dataBaseModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      this.netModule = netModuleParam;
      initialize(applicationContextModuleParam, dataBaseModuleParam, netModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final DataBaseModule dataBaseModuleParam, final NetModule netModuleParam) {
      this.provideAppDataBaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDataBase>(singletonCImpl, 4));
      this.provideCitiesDaoProvider = DoubleCheck.provider(new SwitchingProvider<CitiesDao>(singletonCImpl, 3));
      this.citiesLocalDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 2);
      this.bindCitiesLocalDataSourceProvider = DoubleCheck.provider((Provider) citiesLocalDataSourceImplProvider);
      this.citiesRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 1);
      this.bindCitiesRepositoryProvider = DoubleCheck.provider((Provider) citiesRepositoryImplProvider);
      this.provideGetCitiesUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<GetCitiesUseCase>(singletonCImpl, 0));
      this.provideAddCityUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<AddCityUseCase>(singletonCImpl, 5));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 11));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 10));
      this.provideApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<ApiService>(singletonCImpl, 9));
      this.weatherRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 8);
      this.bindWeatherRemoteDataSourceProvider = DoubleCheck.provider((Provider) weatherRemoteDataSourceImplProvider);
      this.provideWeatherHistoryDaoProvider = DoubleCheck.provider(new SwitchingProvider<WeatherHistoryDao>(singletonCImpl, 13));
      this.weatherHistoryLocalDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 12);
      this.bindWeatherHistoryLocalDataSourceProvider = DoubleCheck.provider((Provider) weatherHistoryLocalDataSourceImplProvider);
      this.weatherRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 7);
      this.bindWeatherRepositoryProvider = DoubleCheck.provider((Provider) weatherRepositoryImplProvider);
      this.provideGetCurrentWeatherUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<GetCurrentWeatherUseCase>(singletonCImpl, 6));
      this.provideSaveWeatherHistoryUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<SaveWeatherHistoryUseCase>(singletonCImpl, 14));
      this.provideGetWeatherHistoryByIdUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<GetWeatherHistoryByIdUseCase>(singletonCImpl, 15));
      this.provideGetWeatherHistoryUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<GetWeatherHistoryUseCase>(singletonCImpl, 16));
    }

    @Override
    public void injectWeatherApplication(WeatherApplication weatherApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.planradar.weatherassessment.cities.domain.usecase.GetCitiesUseCase 
          return (T) UseCaseModule_ProvideGetCitiesUseCaseFactory.provideGetCitiesUseCase(singletonCImpl.bindCitiesRepositoryProvider.get());

          case 1: // com.planradar.weatherassessment.cities.data.repository.CitiesRepositoryImpl 
          return (T) new CitiesRepositoryImpl(singletonCImpl.bindCitiesLocalDataSourceProvider.get());

          case 2: // com.planradar.weatherassessment.cities.data.datasource.CitiesLocalDataSourceImpl 
          return (T) new CitiesLocalDataSourceImpl(singletonCImpl.provideCitiesDaoProvider.get());

          case 3: // com.planradar.weatherassessment.cities.data.CitiesDao 
          return (T) LocalDataModule_Companion_ProvideCitiesDaoFactory.provideCitiesDao(singletonCImpl.provideAppDataBaseProvider.get());

          case 4: // com.planradar.weatherassessment.core.db.AppDataBase 
          return (T) DataBaseModule_ProvideAppDataBaseFactory.provideAppDataBase(singletonCImpl.dataBaseModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 5: // com.planradar.weatherassessment.cities.domain.usecase.AddCityUseCase 
          return (T) UseCaseModule_ProvideAddCityUseCaseFactory.provideAddCityUseCase(singletonCImpl.bindCitiesRepositoryProvider.get());

          case 6: // com.planradar.weatherassessment.weather.domain.usecase.GetCurrentWeatherUseCase 
          return (T) UseCaseModule_ProvideGetCurrentWeatherUseCaseFactory.provideGetCurrentWeatherUseCase(singletonCImpl.bindWeatherRepositoryProvider.get());

          case 7: // com.planradar.weatherassessment.weather.data.repository.WeatherRepositoryImpl 
          return (T) new WeatherRepositoryImpl(singletonCImpl.bindWeatherRemoteDataSourceProvider.get(), singletonCImpl.bindWeatherHistoryLocalDataSourceProvider.get());

          case 8: // com.planradar.weatherassessment.weather.data.datasource.WeatherRemoteDataSourceImpl 
          return (T) new WeatherRemoteDataSourceImpl(singletonCImpl.provideApiServiceProvider.get());

          case 9: // com.planradar.weatherassessment.core.api.ApiService 
          return (T) NetModule_ProvideApiServiceFactory.provideApiService(singletonCImpl.netModule, singletonCImpl.provideRetrofitProvider.get());

          case 10: // retrofit2.Retrofit 
          return (T) NetModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.netModule, singletonCImpl.provideOkHttpClientProvider.get());

          case 11: // okhttp3.OkHttpClient 
          return (T) NetModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.netModule);

          case 12: // com.planradar.weatherassessment.weather.data.datasource.WeatherHistoryLocalDataSourceImpl 
          return (T) new WeatherHistoryLocalDataSourceImpl(singletonCImpl.provideWeatherHistoryDaoProvider.get());

          case 13: // com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao 
          return (T) LocalDataModule_Companion_ProvideWeatherHistoryDaoFactory.provideWeatherHistoryDao(singletonCImpl.provideAppDataBaseProvider.get());

          case 14: // com.planradar.weatherassessment.weather.domain.usecase.SaveWeatherHistoryUseCase 
          return (T) UseCaseModule_ProvideSaveWeatherHistoryUseCaseFactory.provideSaveWeatherHistoryUseCase(singletonCImpl.bindWeatherRepositoryProvider.get());

          case 15: // com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryByIdUseCase 
          return (T) UseCaseModule_ProvideGetWeatherHistoryByIdUseCaseFactory.provideGetWeatherHistoryByIdUseCase(singletonCImpl.bindWeatherRepositoryProvider.get());

          case 16: // com.planradar.weatherassessment.weather.domain.usecase.GetWeatherHistoryUseCase 
          return (T) UseCaseModule_ProvideGetWeatherHistoryUseCaseFactory.provideGetWeatherHistoryUseCase(singletonCImpl.bindWeatherRepositoryProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
