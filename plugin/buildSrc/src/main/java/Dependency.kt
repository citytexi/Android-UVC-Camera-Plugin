object Versions {
}

sealed class CustomDependencies {

    object Android : CustomDependencies() {
        const val CORE = "androidx.core:core-ktx:1.8.0"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.6.1"
        const val MATERIAL = "com.google.android.material:material:1.5.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Test : CustomDependencies() {
        //region testImplementation
        const val JUNIT = "junit:junit:4.13.2"
        //endregion

        //region androidTestImplementation
        const val JUNIT_EXT = "androidx.test.ext:junit:1.1.5"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:3.5.1"
        //endregion
    }

}