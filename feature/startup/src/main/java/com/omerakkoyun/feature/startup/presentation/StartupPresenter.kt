package com.omerakkoyun.feature.startup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.omerakkoyun.feature.startup.data.Detail
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */

@Composable
fun StartupPresenter(
    action1: () -> Unit,
    action2: () -> Unit,
    deepLinkDetail: Detail? = null,
    viewModel: StartupViewModel = koinViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = androidx.compose.material3.MaterialTheme.colorScheme.tertiary),
        contentAlignment = Alignment.Center
    ) {
        if (deepLinkDetail != null) {
            Text(text = "Startup Screen with deep link: ${deepLinkDetail.description}")
        } else {
            Text(text = "Startup Screen without deep link")
        }

    }

    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(2000L) // Simulate a delay for demonstration
        if (deepLinkDetail == null || deepLinkDetail.id == 0) {
            action1()
        } else {
            // Deep link'ten geldiyse, belki detail'e git veya main'e geç yada notification'a git gibi bir durum olabilir
            action2()
        }
        // force update kontrol yapılabilir vsvs.
    }
}
