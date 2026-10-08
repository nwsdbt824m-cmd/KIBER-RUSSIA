plugins {
    id("com.android.application") version "8.2.2"
}

android {
    namespace = "com.kiber.russia" // Сборщик подставит имя вашего репозитория автоматически
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kiber.russia"
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
