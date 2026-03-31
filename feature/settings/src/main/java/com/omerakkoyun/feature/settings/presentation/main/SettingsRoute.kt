package com.omerakkoyun.feature.settings.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.feature.settings.navigation.SettingsNavigationAction
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun SettingsRoute(
    onNavigate: (SettingsNavigationAction) -> Unit,
    viewModel: SettingsViewModel = koinViewModel()
) {
    LaunchedEffect(viewModel) {
        viewModel.effects.collect { effect ->
            when (effect) {
                SettingsEffect.NavigateToAccount ->
                    onNavigate(SettingsNavigationAction.Account)

                SettingsEffect.NavigateToNotifications ->
                    onNavigate(SettingsNavigationAction.Notifications)

                SettingsEffect.NavigateToTheme ->
                    onNavigate(SettingsNavigationAction.Theme)

                SettingsEffect.NavigateToKvkk ->
                    onNavigate(SettingsNavigationAction.Kvkk)
            }
        }
    }

    SettingsScreen(
        onAccountClick = viewModel::onAccountClick,
        onNotificationsClick = viewModel::onNotificationsClick,
//        onThemeClick = viewModel::onThemeClick,
//        onKvkkClick = viewModel::onKvkkClick
    )
}
