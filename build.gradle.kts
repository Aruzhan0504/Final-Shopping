plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.shopnavbar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.shopnavbar"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures{
        viewBinding= true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation ("androidx.recyclerview:recyclerview:1.2.1")  // Убедитесь, что версия правильная

    implementation("com.google.code.gson:gson:2.9.1")
    implementation ("com.github.bumptech.glide:glide:4.15.1")


        implementation ("androidx.room:room-runtime:2.3.0")
        annotationProcessor ("androidx.room:room-compiler:2.3.0")

    implementation ("androidx.sqlite:sqlite:2.1.0")





    implementation(libs.constraintlayout)
    implementation(libs.recyclerview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}