plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.testing"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

