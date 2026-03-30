plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.startup"
}

dependencies {
    implementation(project(":core:navigation"))

}
