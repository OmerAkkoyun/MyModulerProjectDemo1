plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.database"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

