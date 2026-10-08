plugins {
    id("com.android.application") version "8.2.2"
}

android {
    namespace = "com.mylauncher"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mylauncher"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
