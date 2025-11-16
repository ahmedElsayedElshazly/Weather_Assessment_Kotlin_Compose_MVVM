package com.planradar.weatherassessment.weather.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.planradar.weatherassessment.theme.Gray
import com.planradar.weatherassessment.weather.domain.model.WeatherHistory
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WeatherHistoryItem(
    weatherHistory: WeatherHistory,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = "${BuildConfig.WEATHER_ICON_BASE_URL}${weatherHistory.iconId}.png",
            contentDescription = weatherHistory.description,
            modifier = Modifier
                .height(30.dp)
                .width(24.dp)
        )

        Spacer(modifier = Modifier.width(21.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = formatTimestamp(weatherHistory.timestamp),
                style = MaterialTheme.typography.bodySmall.copy(
                    fontSize = 12.sp,
                    color = Gray
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "${weatherHistory.description.replaceFirstChar { it.uppercaseChar() }}, ${weatherHistory.temperature.toInt()}${stringResource(R.string.degree_celsius)}",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )
            )
        }
    }
}

private fun formatTimestamp(timestamp: Long): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy - HH:mm", Locale.getDefault())
    return dateFormat.format(Date(timestamp))
}

