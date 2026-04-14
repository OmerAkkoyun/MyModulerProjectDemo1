
/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply("com.android.application")
        pluginManager.apply("org.jetbrains.kotlin.android")
        pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")

        extensions.configure<ApplicationExtension> {


            compileSdk = ProjectConfigs.compileSdk

            defaultConfig {
                applicationId = ProjectConfigs.applicationId
                minSdk = ProjectConfigs.minSdk
                targetSdk = ProjectConfigs.targetSdk
                versionCode = ProjectConfigs.versionCode
                versionName = ProjectConfigs.versionName
                testInstrumentationRunner = ProjectConfigs.testInstrumentationRunner
            }
            buildTypes {
                release {
                    isMinifyEnabled = false
                    proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                }
            }

            compileOptions {
                sourceCompatibility = ProjectConfigs.sourceCompatibility
                targetCompatibility = ProjectConfigs.targetCompatibility
            }

            buildFeatures {
                compose = true
            }

            packaging {
                resources {
                    excludes += ProjectConfigs.excludesFiles
                }
            }

        }
    }
}