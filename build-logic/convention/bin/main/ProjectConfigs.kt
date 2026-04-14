import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

object ProjectConfigs {
    const val applicationId = "com.omerakkoyun.mymodulerproject"
    const val compileSdk = 36
    const val minSdk = 26
    const val targetSdk = 36
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val excludesFiles = "/META-INF/{AL2.0,LGPL2.1}"
    const val jdkVersion = 17
    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
    val jvmTarget = JvmTarget.JVM_17
}