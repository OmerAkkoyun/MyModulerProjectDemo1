plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.network"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

