package com.omerakkoyun.feature.main.navigation


import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.mymodulerproject.feature.main.R

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */

/**
 * Bottom Nav Item metadata.
 */
sealed class BottomNavItem(
    @StringRes val labelRes: Int,
    val icon: ImageVector,
    val route: Route.TopLevel
) {
    data object HomeTab : BottomNavItem(
        labelRes = R.string.bottom_home ,
        icon = Icons.Default.Home,
        route = Route.TopLevel.HomeTab
    )

    data object SettingsTab : BottomNavItem(
        labelRes = R.string.bottom_settings,
        icon = Icons.Default.Settings,
        route = Route.TopLevel.SettingsTab
    )

    data object ProfileTab : BottomNavItem(
        labelRes = R.string.bottom_profile,
        icon = Icons.Default.Person,
        route = Route.TopLevel.ProfileTab
    )

    companion object {
        val items = listOf(HomeTab, SettingsTab, ProfileTab)
    }
}