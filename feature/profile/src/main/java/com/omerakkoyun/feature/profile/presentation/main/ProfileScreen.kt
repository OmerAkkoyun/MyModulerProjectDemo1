package com.omerakkoyun.feature.profile.presentation.main

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.secondaryContainer),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Profile Screen")
    }
}