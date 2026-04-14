package com.omerakkoyun.feature.settings.presentation.language

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.core.navigation.RouteSettingsScreen
import com.omerakkoyun.feature.settings.presentation.uimodel.LanguageUiModel

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */
@Composable
fun LanguageScreen(uiModel: LanguageUiModel,navigator: Navigator) {
    Box(
        modifier = Modifier.fillMaxSize().background(color = androidx.compose.material3.MaterialTheme.colorScheme.error),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "data pass -> code: ${uiModel.code}, from settings list screen", color = androidx.compose.material3.MaterialTheme.colorScheme.onError)
            Button( onClick = {
                navigator.popUpTo(
                    route = RouteSettingsScreen,
                    inclusiveRemoveTargetRoute = false
                )
            }) {
                Text(text = "Change Language and Go Settings Main List Screen", color= androidx.compose.material3.MaterialTheme.colorScheme.onPrimary)
            }
        }
    }
}