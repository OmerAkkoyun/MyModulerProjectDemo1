package com.omerakkoyun.feature.settings.presentation.account

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
@Composable
fun AccountSettingsScreen(
    navigator: Navigator
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Account Settings",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        AccountItem(title = "Name", value = "John Doe")
        AccountItem(title = "Email", value = "john.doe@example.com")
        AccountItem(title = "Phone", value = "+1 234 567 890")
        AccountItem(title = "Password", value = "********")
        Button(onClick = {
                navigator.navigateToTab(Route.Graph.ProfileGraph)
        }) {
            Text(text = "Navigate to tab (profile) ")
        }

        Button(onClick = {
                navigator.navigateAndClearBackStack(Route.Graph.ProfileGraph)
        }) {
            Text(text = "Navigate to (profile) and clear back stack")
        }


        Button(onClick = {
                navigator.navigateUp()
        }) {
            Text(text = "Navigate up")
        }

        Button(onClick = {
                navigator.navigateTo(Route.Screen.LanguageScreen)
        }) {
            Text(text = "Go Language Screen")
        }
    }
}

@Composable
private fun AccountItem(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {

        Text(
            text = title,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 4.dp)
        )

        Divider(modifier = Modifier.padding(top = 12.dp))
    }
}