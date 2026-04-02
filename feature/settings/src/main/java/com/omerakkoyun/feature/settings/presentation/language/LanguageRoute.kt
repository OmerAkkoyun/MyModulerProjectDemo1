package com.omerakkoyun.feature.settings.presentation.language

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.settings.presentation.main.SettingsEffect
import com.omerakkoyun.feature.settings.presentation.main.SettingsScreen
import com.omerakkoyun.feature.settings.presentation.main.SettingsViewModel
import com.omerakkoyun.feature.settings.presentation.uimodel.LanguageUiModel
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun LanguageRoute(
    navigator: Navigator,
    viewModel: LanguageViewModel = koinViewModel() // inject viewmodel and get backStackEntry if have arguments
) {
    LaunchedEffect(viewModel) {
        // todo: Handle
    }

    //  todo test
    LanguageScreen(
        uiModel = LanguageUiModel(viewModel.getLanguageCode()),
        navigator = navigator
    )
}
