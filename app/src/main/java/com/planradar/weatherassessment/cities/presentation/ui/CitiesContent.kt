package com.planradar.weatherassessment.cities.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.theme.WeatherAppAssessmentTheme

@Composable
fun CitiesContent(
    cities: List<CityEntity>,
    isLoading: Boolean,
    onCityClick: (CityEntity) -> Unit = {},
    onCityInfoClick: (CityEntity) -> Unit = {},
    modifier: Modifier = Modifier
) {
    if (isLoading) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Transparent),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(cities) { city ->
                CityItem(
                    city = city,
                    onClick = { onCityClick(city) },
                    onInfoClick = { onCityInfoClick(city) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CitiesContentPreview() {
    WeatherAppAssessmentTheme {
        CitiesContent(
            cities = listOf(
                CityEntity(id = 1, name = "London, UK"),
                CityEntity(id = 2, name = "Paris, FR"),
                CityEntity(id = 3, name = "Vienna, AUT")
            ),
            isLoading = false,
            modifier = Modifier.height(400.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CitiesContentLoadingPreview() {
    WeatherAppAssessmentTheme {
        CitiesContent(
            cities = emptyList(),
            isLoading = true,
            modifier = Modifier.height(400.dp)
        )
    }
}

