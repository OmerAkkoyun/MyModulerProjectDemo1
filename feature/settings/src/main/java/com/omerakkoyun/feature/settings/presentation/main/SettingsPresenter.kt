package com.omerakkoyun.feature.settings.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.RouteAccountScreen
import com.omerakkoyun.core.navigation.RouteLanguageScreen
import com.omerakkoyun.core.navigation.RouteNotificationsScreen
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun SettingsPresenter(
    navigator: Navigator,
    viewModel: SettingsViewModel = koinViewModel()
) {
    LaunchedEffect(viewModel) {
        viewModel.effects.collect { effect ->
            when (effect) {
                SettingsEffect.NavigateToAccount ->
                    navigator.navigateTo(RouteAccountScreen)

                SettingsEffect.NavigateToNotifications ->
                    navigator.navigateTo(RouteNotificationsScreen)

                is SettingsEffect.NavigateToLanguage ->
                    navigator.navigateTo(RouteLanguageScreen(effect.code))

            }
        }
    }

    SettingsScreen(
        onAccountClick = viewModel::onAccountClick,
        onNotificationsClick = viewModel::onNotificationsClick,
        onLanguageClick = viewModel::onLanguageClick
    )
}
