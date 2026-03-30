plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.core.navigation"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.koin.core)
    implementation(libs.androidx.navigation.compose)
}

