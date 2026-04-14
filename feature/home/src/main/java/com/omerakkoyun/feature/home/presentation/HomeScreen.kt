package com.omerakkoyun.feature.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
@Composable
fun HomeScreen(onNavigateToX: () -> Unit, onNavigateToY: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Welcome to Home", color = Color.White)
        Button(onClick = {
            onNavigateToX()
        }) {
            Text("Go to Route Notifications Screen", color = Color.White)
        }
    }
}