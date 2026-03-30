plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.settings"
}

dependencies {
    implementation(project(":core:navigation"))

}
