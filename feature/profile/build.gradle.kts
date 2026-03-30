plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.profile"
}

dependencies {
    implementation(project(":core:navigation"))

}
