package com.omerakkoyun.feature.startup.presentation

import androidx.lifecycle.ViewModel
import com.omerakkoyun.core.navigation.MainGraph
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */

    class StartupViewModel(
        private val navigator: Navigator
    ) : ViewModel() {


        fun testGoMain() {
            // Complete onboarding and go to HomeGraph (root of main feature)
            // Using clearBackStack so onboarding cannot be re-entered via back button.
            navigator.navigateAndClearBackStack(MainGraph)
        }
    }