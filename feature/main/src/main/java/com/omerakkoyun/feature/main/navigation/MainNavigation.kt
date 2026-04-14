package com.omerakkoyun.feature.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.HomeGraph
import com.omerakkoyun.core.navigation.MainGraph
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.feature.home.navigation.homeTabGraph
import com.omerakkoyun.feature.profile.navigation.profileTabGraph
import com.omerakkoyun.feature.settings.navigation.settingsTabGraph

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
fun NavGraphBuilder.mainGraph(
    navigator: Navigator,
) {
    navigation<MainGraph>(
        startDestination = HomeGraph
    ) {
        homeTabGraph(navigator = navigator)
        settingsTabGraph(navigator = navigator)
        profileTabGraph()
    }
}