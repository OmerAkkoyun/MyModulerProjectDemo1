package com.omerakkoyun.feature.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */

@Composable
fun HomeRoute(navigator: Navigator, viewModel: HomeViewModel = koinViewModel()) {

    LaunchedEffect(viewModel) {
        viewModel.effects.collect {  effect ->
            when (effect) {
                is HomeUiEffect.NavigateToX -> navigator.navigateTo(Route.Screen.StartupScreen)
                is HomeUiEffect.NavigateToY -> navigator.navigateTo(Route.Screen.StartupScreen)
            }
        }
    }

    HomeScreen(
        onNavigateToX = { viewModel.onXClick() },
        onNavigateToY = { viewModel.onYClick() }
    )

}