package com.omerakkoyun.feature.settings.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun SettingsRoute(
    navigator: Navigator,
    viewModel: SettingsViewModel = koinViewModel()
) {
    LaunchedEffect(viewModel) {
        viewModel.effects.collect { effect ->
            when (effect) {
                SettingsEffect.NavigateToAccount ->
                    navigator.navigateTo(Route.Screen.AccountScreen)

                SettingsEffect.NavigateToNotifications ->
                    navigator.navigateTo(Route.Screen.Notifications)

                is SettingsEffect.NavigateToLanguage ->
                    navigator.navigateToWithArgs(
                        Route.Screen.LanguageScreen.buildNav(effect.code) //  örN: "language/tr"
                    )

            }
        }
    }

    SettingsScreen(
        onAccountClick = viewModel::onAccountClick,
        onNotificationsClick = viewModel::onNotificationsClick,
        onLanguageClick = viewModel::onLanguageClick
    )
}
