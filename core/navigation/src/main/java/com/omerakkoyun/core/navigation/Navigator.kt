package com.omerakkoyun.core.navigation

import kotlinx.coroutines.flow.SharedFlow

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
interface Navigator {
    val navigateCommands: SharedFlow<NavigationCommands>

    fun navigateTo(route: Route)

    fun navigateAndReplaceStack(vararg routes: Route)

    fun navigateToTab(route: Route)

    fun navigateUp()

    fun popUpTo(route: Route, inclusiveRemoveTargetRoute: Boolean)

    fun navigateAndClearBackStack(route: Route)
}