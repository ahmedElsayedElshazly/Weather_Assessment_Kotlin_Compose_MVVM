package com.planradar.weatherassessment.core.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StatusBarOverlay(
    modifier: Modifier = Modifier,
    opacity: Float = 0.3f
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(0.dp) // Will be sized by status bars
            .background(Color.Black.copy(alpha = opacity))
    )
}

