package com.planradar.weatherassessment.core.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.theme.MainBlue

@Composable
fun BaseScreen(
    headerTitle: String,
    onBackPress: (() -> Unit)? = null,
    showBackButton: Boolean = true,
    contentPaddingTop: androidx.compose.ui.unit.Dp = 0.dp,
    content: @Composable BoxScope.() -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .windowInsetsTopHeight(WindowInsets.statusBars)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MainBlue)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.3f))
            )
        }

        AppHeader(
            title = headerTitle,
            onBackPress = onBackPress ?: {},
            showBackButton = showBackButton,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 150.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFFFFFFF),
                                Color(0xFFD6D3DE)
                            )
                        )
                    )
            )

            Image(
                painter = painterResource(id = R.drawable.screen_background),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .fillMaxHeight(0.35f),
                contentScale = ContentScale.FillWidth
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = (contentPaddingTop))
        ) {
            content()
        }
    }
}
