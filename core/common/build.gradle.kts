plugins {
    id("myplugin.android.library")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.core.common"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
