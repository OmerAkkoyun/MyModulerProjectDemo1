package com.omerakkoyun.feature.home.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.core.navigation.RouteNotificationsScreen
import com.omerakkoyun.core.navigation.RouteStartupScreen
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */

@Composable
fun HomePresenter(navigator: Navigator, viewModel: HomeViewModel = koinViewModel()) {

    LaunchedEffect(viewModel) {
        viewModel.effects.collect {  effect ->
            when (effect) {
                is HomeUiEffect.NavigateToX -> navigator.navigateTo(RouteNotificationsScreen)
                is HomeUiEffect.NavigateToY -> navigator.navigateTo(RouteNotificationsScreen)
            }
        }
    }

    HomeScreen(
        onNavigateToX = { viewModel.onXClick() },
        onNavigateToY = { viewModel.onYClick() }
    )

}