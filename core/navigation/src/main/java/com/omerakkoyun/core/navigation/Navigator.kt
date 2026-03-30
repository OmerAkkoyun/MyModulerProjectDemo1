package com.omerakkoyun.core.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
interface Navigator {
    val navigateCommands: SharedFlow<NavigationCommands>

    fun navigateTo(route: Route)

    fun navigateToRoute(routeString: String)

    fun navigateToTab(route: Route)

    fun replace(route: Route)

    fun navigateUp()

    fun popUpTo(route: Route, inclusive: Boolean)

    fun clearBackStackAndNavigate(route: Route)

}