plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.np.kotlinlearn_calculator"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.np.kotlinlearn_calculator"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Jetpack Compose dependencies
    implementation("androidx.compose.ui:ui:1.5.0") // Ensure this matches your Compose version
    implementation("androidx.compose.material3:material3:1.1.0") // Material3
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0") // Preview support
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Lifecycle support
    implementation("androidx.activity:activity-compose:1.6.1") // Activity Compose

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.0") // UI testing for Compose
}

