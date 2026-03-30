package com.omerakkoyun.feature.startup.presentation

import androidx.lifecycle.ViewModel
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */

    class StartupViewModel(
        private val navigator: Navigator
    ) : ViewModel() {


        fun testGoMain() {
            // Complete onboarding and go to HomeGraph (root of main feature)
            // Using clearBackStack so onboarding cannot be re-entered via back button.
            navigator.replace(Route.MainGraph)
        }
    }