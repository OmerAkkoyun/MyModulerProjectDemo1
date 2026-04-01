package com.omerakkoyun.core.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
interface Navigator {
    val navigateCommands: SharedFlow<NavigationCommands>

    fun navigateTo(route: Route)

    fun navigateByRouteName(routeString: String)

    fun navigateToTab(route: Route.TopLevel)

    fun navigateUp()

    fun popUpTo(route: Route, inclusive: Boolean)

    fun navigateAndClearBackStack(route: Route)

}