package com.omerakkoyun.mymodulerproject.app.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.omerakkoyun.core.navigation.NavigationCommands

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */

fun NavHostController.handle(command: NavigationCommands){
    val navController = this
    when(command){
        is NavigationCommands.NavigateTo -> {
            this.navigate(command.route.nav)
        }

        is NavigationCommands.NavigateToRoute -> {
            this.navigate(command.routeString)
        }

        is NavigationCommands.NavigateToTab -> {
            this.navigate(command.route.nav) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                restoreState = true
                launchSingleTop = true
            }
        }

        is NavigationCommands.Replace -> {
            this.navigate(command.route.nav){
                popUpTo(navController.graph.id){
                    inclusive = true
                }
            }
        }

        is NavigationCommands.ClearBackStackAndNavigate -> {
            this.navigate(command.route.nav){
                popUpTo(navController.graph.id){
                    inclusive = true
                }
                launchSingleTop = true
            }
        }

        is NavigationCommands.NavigateUp -> {
            this.navigateUp()
        }

        is NavigationCommands.PopUpTo -> {
            this.popBackStack(
                command.route.nav,
                command.inclusive
            )
        }
    }
}