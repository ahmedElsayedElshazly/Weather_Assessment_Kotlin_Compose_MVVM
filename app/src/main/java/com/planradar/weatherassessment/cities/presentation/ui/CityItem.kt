package com.planradar.weatherassessment.cities.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.cities.data.model.CityEntity
import com.planradar.weatherassessment.theme.MainBlue
import com.planradar.weatherassessment.theme.WeatherAppAssessmentTheme

@Composable
fun CityItem(
    city: CityEntity,
    onClick: () -> Unit = {},
    onInfoClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_location_city),
                contentDescription = "City icon",
                tint = MainBlue,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = city.name,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Black,
                    fontSize = 14.sp,
                    color = Color.Black
                )
            )
        }

        IconButton(onClick = onInfoClick) {
            Icon(
                painter = painterResource(id = R.drawable.ic_info),
                contentDescription = "City info",
                tint = MainBlue,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CityItemPreview() {
    WeatherAppAssessmentTheme {
        CityItem(
            city = CityEntity(
                id = 1,
                name = "London, UK"
            )
        )
    }
}
