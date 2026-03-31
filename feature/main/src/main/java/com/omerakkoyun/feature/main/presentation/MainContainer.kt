package com.omerakkoyun.feature.main.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.omerakkoyun.feature.main.navigation.BottomNavItem

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
@Composable
fun MainContainer(
    currentDestination: NavDestination?,
    onTabSelected: (BottomNavItem) -> Unit,
    showBottomBar: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val items = BottomNavItem.items

    Scaffold(
        modifier = modifier,
        bottomBar = {
            if (showBottomBar){
                NavigationBar {
                    items.forEach { item ->
                        val selected = currentDestination
                            ?.hierarchy
                            ?.any { destination -> destination.route == item.route.nav } == true

                        NavigationBarItem(
                            selected = selected,
                            onClick = { onTabSelected(item) },
                            icon = {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = stringResource(item.labelRes)
                                )
                            },
                            label = {
                                Text(text = stringResource(item.labelRes))
                            }
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        content()
    }
}

