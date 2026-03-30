plugins {
    id("myplugin.android.library")
    id("myplugin.android.compose")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

