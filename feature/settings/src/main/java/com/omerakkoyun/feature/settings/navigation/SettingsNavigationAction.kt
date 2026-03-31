package com.omerakkoyun.feature.settings.navigation

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
sealed interface SettingsNavigationAction {
    data object Account : SettingsNavigationAction
    data object Notifications : SettingsNavigationAction
    data object Theme : SettingsNavigationAction
    data object Kvkk : SettingsNavigationAction
}