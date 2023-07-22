plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.citytexi.uvc_plugin"
    compileSdk = BuildConfig.compileSdk

    defaultConfig {
        minSdk = BuildConfig.minSdk

        testInstrumentationRunner = BuildConfig.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
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
    compileOnly(files("libs//classes.jar"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))

    implementation(CustomDependencies.Android.CORE)
    implementation(CustomDependencies.Android.APP_COMPAT)
    implementation(CustomDependencies.Android.MATERIAL)
    testImplementation(CustomDependencies.Test.JUNIT)
    androidTestImplementation(CustomDependencies.Test.JUNIT_EXT)
    androidTestImplementation(CustomDependencies.Test.ESPRESSO)
}