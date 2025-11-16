package com.planradar.weatherassessment.cities.domain.usecase;

import com.planradar.weatherassessment.cities.data.model.CityEntity;
import com.planradar.weatherassessment.cities.domain.repository.CitiesRepository;
import org.junit.Before;
import org.junit.Test;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/planradar/weatherassessment/cities/domain/usecase/DeleteCityUseCaseTest;", "", "()V", "deleteCityUseCase", "Lcom/planradar/weatherassessment/cities/domain/usecase/DeleteCityUseCase;", "repository", "Lcom/planradar/weatherassessment/cities/domain/repository/CitiesRepository;", "invoke should call repository deleteCity", "", "Lkotlinx/coroutines/test/TestResult;", "invoke should delete correct city entity", "setup", "app_releaseUnitTest"})
public final class DeleteCityUseCaseTest {
    private com.planradar.weatherassessment.cities.domain.repository.CitiesRepository repository;
    private com.planradar.weatherassessment.cities.domain.usecase.DeleteCityUseCase deleteCityUseCase;
    
    public DeleteCityUseCaseTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}