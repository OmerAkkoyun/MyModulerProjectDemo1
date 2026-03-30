plugins {
    id("myplugin.feature")
}

android {
    namespace = "com.omerakkoyun.mymodulerproject.feature.main"
}

dependencies {
    implementation(project(":core:navigation"))

    implementation(project(":feature:home"))
    implementation(project(":feature:profile"))
    implementation(project(":feature:settings"))

}