plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.auth"
}

dependencies {
    implementation(project(":core:navigation"))

}
