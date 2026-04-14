plugins {
    id("myplugin.android.application")
    id("myplugin.android.compose")
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.app"



    kotlin {
        compilerOptions {
            jvmTarget = ProjectConfigs.jvmTarget
        }
    }

    buildFeatures {
        compose = true
    }

}

dependencies {

    // Core
    implementation(project(":core:navigation"))

    // Features
    implementation(project(":feature:startup"))
    implementation(project(":feature:auth"))
    implementation(project(":feature:home"))
    implementation(project(":feature:profile"))
    implementation(project(":feature:settings"))
    implementation(project(":feature:main"))

    // Android basics
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Navigation
    implementation(libs.androidx.navigation.compose)

    // Koin (Application seviyesinde)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)

    // Serialization
    implementation(libs.kotlinx.serialization.json)

    // Debug
    debugImplementation(libs.androidx.compose.ui.tooling)

    // Test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
}