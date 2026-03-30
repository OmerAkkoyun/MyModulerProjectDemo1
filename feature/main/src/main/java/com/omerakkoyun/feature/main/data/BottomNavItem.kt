package com.omerakkoyun.feature.main.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */

/**
 * Bottom Nav Item metadata.
 */
sealed class BottomNavItem(
    val route: Route,
    val label: String,
    val icon: ImageVector
) {
    data object HomeTab : BottomNavItem(Route.Home, "Home", Icons.Default.Home)
    data object ProfileTab : BottomNavItem(Route.Profile, "Profile", Icons.Default.Person)
    data object SettingsTab : BottomNavItem(Route.Settings, "Settings", Icons.Default.Settings)
}