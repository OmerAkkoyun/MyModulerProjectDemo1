package com.omerakkoyun.feature.main.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.home.navigation.homeTabGraph
import com.omerakkoyun.feature.main.data.BottomNavItem
import com.omerakkoyun.feature.profile.navigation.profileTabGraph
import com.omerakkoyun.feature.settings.navigation.settingsTabGraph

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val items = listOf(
        BottomNavItem.HomeTab,
        BottomNavItem.SettingsTab,
        BottomNavItem.ProfileTab
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEach { item ->
                    val selected = currentDestination?.hierarchy?.any { it.route == item.route.nav } == true
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        selected = selected,
                        onClick = {
                            navController.navigate(item.route.nav) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Route.HomeGraph.nav,
            modifier = Modifier.padding(innerPadding)
        ) {
            homeTabGraph()
            settingsTabGraph()
            profileTabGraph()
        }
    }
}

