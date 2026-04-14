package com.omerakkoyun.feature.settings.presentation.language

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.feature.settings.presentation.uimodel.LanguageUiModel
import org.koin.androidx.compose.koinViewModel

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun LanguagePresenter(
    uiModel : LanguageUiModel,
    navigator: Navigator,
    viewModel: LanguageViewModel = koinViewModel()
) {
    LaunchedEffect(viewModel) {
        // todo: Handle
    }

    //  todo test
    LanguageScreen(
        uiModel = uiModel,
        navigator = navigator
    )
}
