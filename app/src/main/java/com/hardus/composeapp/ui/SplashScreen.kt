package com.hardus.composeapp.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hardus.composeapp.R
import com.hardus.composeapp.ui.navigation.Screen
import com.hardus.composeapp.ui.theme.ComposeAppTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var startSplashScreen by remember { mutableStateOf(false) }
    val alPha = animateFloatAsState(
        targetValue = if (startSplashScreen) 1f else 0f,
        animationSpec = tween(
            durationMillis = 100
        )
    )
    LaunchedEffect(key1 = true) {
        startSplashScreen = true
        delay(1000)
        navController.popBackStack()
        navController.navigate(Screen.Home.route)
    }

    Splash(alpha = alPha.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painterResource(R.drawable.splash_image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenView() {
    ComposeAppTheme() {
        Splash(
            alpha = 1f
        )
    }
}