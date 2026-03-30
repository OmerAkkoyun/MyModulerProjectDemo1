package com.omerakkoyun.feature.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
@Composable
fun HomeScreen() {
    Column {
        Text("Welcome to Home")
        Button(onClick = {
            //viewmodel ui event clicked, navigate to profile screen in viewmodel
        }) {
            Text("Go to Profile")
        }
    }
}