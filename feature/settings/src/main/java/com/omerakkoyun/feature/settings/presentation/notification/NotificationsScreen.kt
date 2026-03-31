package com.omerakkoyun.feature.settings.presentation.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun NotificationsScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = androidx.compose.material3.MaterialTheme.colorScheme.error),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Notifications Screen")
    }
}