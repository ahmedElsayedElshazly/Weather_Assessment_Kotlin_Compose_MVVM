package com.planradar.weatherassessment.weather.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.planradar.weatherassessment.BuildConfig
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.weather.domain.model.Weather

@Composable
fun WeatherCard(
    weather: Weather,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = weather.cityName,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier.padding(bottom = 68.dp)
            )

            AsyncImage(
                model = "${BuildConfig.WEATHER_ICON_BASE_URL}${weather.iconId}.png",
                contentDescription = weather.description,
                modifier = Modifier
                    .height(77.dp)
                    .width(94.dp)
            )

            Spacer(modifier = Modifier.height(73.dp))

            WeatherDetailRow(
                label = stringResource(R.string.description),
                value = weather.description.replaceFirstChar { it.uppercaseChar() })
            Spacer(modifier = Modifier.height(12.dp))
            WeatherDetailRow(
                label = stringResource(R.string.temperature),
                value = "${weather.temperature.toInt()}${stringResource(R.string.degree_celsius_space)}"
            )
            Spacer(modifier = Modifier.height(12.dp))
            WeatherDetailRow(
                label = stringResource(R.string.humidity),
                value = "${weather.humidity}${stringResource(R.string.percent)}"
            )
            Spacer(modifier = Modifier.height(12.dp))
            WeatherDetailRow(
                label = stringResource(R.string.windspeed),
                value = "${weather.windSpeed.toInt()}${stringResource(R.string.km_per_hour)}"
            )
        }
    }
}

@Composable
private fun WeatherDetailRow(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color.Black,
                fontWeight = FontWeight.Black,
                lineHeight = 24.sp
            ),
            )

        Text(
            text = value,
            style = MaterialTheme.typography.labelLarge.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF1976D2)
            )
        )
    }
}

