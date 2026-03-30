plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.datastore"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

