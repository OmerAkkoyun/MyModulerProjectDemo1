package com.omerakkoyun.feature.settings.presentation.language

import androidx.lifecycle.ViewModel
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

import kotlin.getValue

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */
class LanguageTestViewModel: ViewModel(), KoinComponent {

    private val navigator: Navigator by inject()

    fun goSecondTab() {
        navigator.navigateToTab(Route.TopLevel.SettingsTab)
    }

}