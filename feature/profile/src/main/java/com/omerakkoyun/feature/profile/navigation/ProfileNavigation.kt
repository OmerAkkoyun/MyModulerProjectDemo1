package com.omerakkoyun.feature.profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.ProfileGraph
import com.omerakkoyun.core.navigation.RouteProfileScreen
import com.omerakkoyun.feature.profile.presentation.main.ProfileScreen

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */

fun NavGraphBuilder.profileTabGraph() {
    navigation<ProfileGraph>(
        startDestination = RouteProfileScreen
    ) {
        composable<RouteProfileScreen> {
            ProfileScreen()
        }
    }
}