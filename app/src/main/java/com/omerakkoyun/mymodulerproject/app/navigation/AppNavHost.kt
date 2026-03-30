package com.omerakkoyun.mymodulerproject.app.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.omerakkoyun.core.navigation.NavigationCommands
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.main.navigation.mainGraph
import com.omerakkoyun.feature.startup.navigation.startupGraph


/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */


@Composable
fun AppNavHost(navigator: Navigator, paddingValues: PaddingValues) {
    val navController = rememberNavController()

    LaunchedEffect(Unit) {
        navigator.navigateCommands.collect { command ->
            when(command){
                is NavigationCommands.NavigateTo -> {
                    navController.navigate(command.route.nav)
                }

                is NavigationCommands.NavigateToRoute -> {
                    navController.navigate(command.routeString)
                }

                is NavigationCommands.NavigateToTab -> {
                    navController.navigate(command.route.nav) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }

                is NavigationCommands.Replace -> {
                    navController.navigate(command.route.nav){
                        popUpTo(navController.graph.id){
                            inclusive = true
                        }
                    }
                }

                is NavigationCommands.ClearBackStackAndNavigate -> {
                    navController.navigate(command.route.nav){
                        popUpTo(navController.graph.id){
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }

                is NavigationCommands.NavigateUp -> {
                    navController.navigateUp()
                }

                is NavigationCommands.PopUpTo -> {
                    navController.popBackStack(
                        command.route.nav,
                        command.inclusive
                    )
                }

            }
        }
    }

    NavHost(
        navController = navController,
        startDestination = Route.StartupGraph.nav,
        route = "root_graph"
    ){
        startupGraph()
        mainGraph()
    }

}