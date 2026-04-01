package com.omerakkoyun.feature.settings.presentation.main

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SettingsScreen(
    onAccountClick: () -> Unit,
    onNotificationsClick: () -> Unit,
    onLanguageClick: () -> Unit
    ) {
    Box(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Text(
                text = "Settings",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            SettingsItem(
                title = "Account",
                onClick = onAccountClick
            )

            SettingsItem(
                title = "Notifications",
                onClick = onNotificationsClick
            )

            SettingsItem(
                title = "Language",
                onClick = onLanguageClick
            )
        }
    }
}

@Composable
fun SettingsItem(
    title: String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 16.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )

        Divider(modifier = Modifier.padding(top = 16.dp))
    }
}