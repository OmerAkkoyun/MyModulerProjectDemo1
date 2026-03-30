plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.home"
}

dependencies {
    implementation(project(":core:navigation"))

}
