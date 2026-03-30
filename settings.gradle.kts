pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }

}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    includeBuild("build-logic")
}

rootProject.name = "MyModulerProject"

//includeBuild("build-logic")
include(":app")

include(":core:common")
include(":core:domain")
include(":core:designsystem")
include(":core:ui")
include(":core:navigation")
include(":core:network")
include(":core:database")
include(":core:datastore")
include(":core:testing")

include(":feature:startup")
include(":feature:auth")
include(":feature:home")
include(":feature:profile")
include(":feature:settings")

include(":feature:main")
