package com.planradar.weatherassessment.core.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.theme.MainBlue
import com.planradar.weatherassessment.theme.WeatherAppAssessmentTheme

@Composable
fun AppHeader(
    title: String,
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier,
    showBackButton: Boolean = true
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(MainBlue)
    ) {
        if (showBackButton) {
            IconButton(
                onClick = onBackPress,
                modifier = Modifier
                    .padding(top = 35.dp)
                    .align(Alignment.TopStart)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = stringResource(R.string.back),
                    tint = Color.White
                )
            }
        }
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 72.dp, bottom = 22.dp),
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                color = Color.White
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppHeaderPreview() {
    WeatherAppAssessmentTheme {
        AppHeader(
            title = stringResource(R.string.cities),
            onBackPress = {}
        )
    }
}

