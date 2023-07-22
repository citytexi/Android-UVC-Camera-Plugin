plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.citytexi.uvccamera"
    compileSdk = BuildConfig.compileSdk

    defaultConfig {
        applicationId = BuildConfig.applicationName
        minSdk = BuildConfig.minSdk
        targetSdk = BuildConfig.targetSdk
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName

        testInstrumentationRunner = BuildConfig.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(BuildConfig.getDefaultProguardFile), BuildConfig.proguardFiles)
        }
    }
    compileOptions {
        sourceCompatibility = BuildConfig.sourceCompatibility
        targetCompatibility = BuildConfig.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = BuildConfig.jvmTarget
    }
}

dependencies {
    implementation(CustomDependencies.Android.CORE)
    implementation(CustomDependencies.Android.APP_COMPAT)
    implementation(CustomDependencies.Android.MATERIAL)
    implementation(CustomDependencies.Android.CONSTRAINT_LAYOUT)
    testImplementation(CustomDependencies.Test.JUNIT)
    androidTestImplementation(CustomDependencies.Test.JUNIT_EXT)
    androidTestImplementation(CustomDependencies.Test.ESPRESSO)
}