plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.domain"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

