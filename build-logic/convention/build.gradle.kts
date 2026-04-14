plugins {
    `kotlin-dsl`
}

group = "com.omerakkoyun.mymodulerproject.buildlogic"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    compileOnly("com.android.tools.build:gradle:8.9.3")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.20")
    implementation("org.jetbrains.kotlin:kotlin-serialization:2.3.20")
}

gradlePlugin {
    plugins {
        register("androidLibraryConvention") {
            id = "myplugin.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidApplicationConvention") {
            id = "myplugin.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidComposeConvention") {
            id = "myplugin.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("featureConvention") {
            id = "myplugin.feature"
            implementationClass = "FeatureConventionPlugin"
        }
    }
}