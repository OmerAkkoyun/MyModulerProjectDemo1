package com.omerakkoyun.mymodulerproject.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.RouteStartupScreen
import com.omerakkoyun.mymodulerproject.app.navigation.AppNavHost
import com.omerakkoyun.mymodulerproject.ui.theme.MyModulerProjectTheme
import org.koin.android.ext.android.inject
import kotlin.getValue

class MainActivity : ComponentActivity() {
    private val navigator: Navigator by inject()
    private lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyModulerProjectTheme {
                navHostController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
                    AppNavHost(
                        navigator = navigator,
                        paddingValues = paddingValues,
                        navHostController = navHostController
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        handleDeepLink(intent)
    }


    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // Uygulama açıkken gelen deep link'i handle et
        handleDeepLink(intent)
        setIntent(intent)
    }

    private fun handleDeepLink(intent: Intent?) {
        intent?.data?.let { uri ->
            // URI'yi parse et: mymoduler://detail/42/hello
            val pathSegments = uri.pathSegments
            if (pathSegments.size >= 2) {
                val id = pathSegments[0].toIntOrNull() ?: 0
                val description = pathSegments[1]

                // Navigation component ile doğru route'a git
                if (::navHostController.isInitialized) {
                    navHostController.navigate(
                        RouteStartupScreen(
                            id = id,
                            description = description
                        )
                    )
                }
            }
        }
    }
}