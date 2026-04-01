package com.omerakkoyun.mymodulerproject.app.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.main.navigation.mainGraph
import com.omerakkoyun.feature.main.presentation.MainContainer
import com.omerakkoyun.feature.startup.navigation.startupGraph

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */

@Composable
fun AppNavHost(
    navigator: Navigator,
    paddingValues: PaddingValues
) {
    val navHostController = rememberNavController()
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    LaunchedEffect(navigator, navHostController) {
        navigator.navigateCommands.collect { command ->
            navHostController.handle(command)
        }
    }

    MainContainer(
        currentDestination = currentDestination,
        showBottomBar = currentDestination.shouldShowBottomBar(),
        onTabSelected = { item ->
            navHostController.navigate(item.route.nav) {
                popUpTo(navHostController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        },
        modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
    ) {
        NavHost(
            navController = navHostController,
            startDestination = Route.Graph.StartupGraph.nav,
            route = Route.Graph.RootGraph.nav
        ) {
            startupGraph()
            mainGraph(navigator)
        }
    }
}