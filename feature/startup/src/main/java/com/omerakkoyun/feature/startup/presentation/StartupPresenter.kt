package com.omerakkoyun.feature.startup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */

@Composable
fun StartupPresenter(viewModel: StartupViewModel = koinViewModel()) {
    Box(
        modifier = Modifier.fillMaxSize().background(color = androidx.compose.material3.MaterialTheme.colorScheme.tertiary),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Startup Screen 2 sec Loading...")
    }

    LaunchedEffect(Unit) {
        // Simulate some startup work, e.g., loading data or checking authentication
        kotlinx.coroutines.delay(2000L) // Simulate a delay for demonstration
        viewModel.testGoMain() // todo test
    }
}
