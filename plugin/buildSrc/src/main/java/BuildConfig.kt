import org.gradle.api.JavaVersion

object BuildConfig {
    const val applicationName = "com.citytexi.uvccamera"
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val majorVersion = "1"
    const val minorVersion = "0"
    const val patchVersion = "0"
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val consumerProguardFiles = "consumer-rules.pro"
    const val getDefaultProguardFile = "proguard-android-optimize.txt"
    const val proguardFiles = "proguard-rules.pro"
    const val jvmTarget = "1.8"

    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
}
