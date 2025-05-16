plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.fooddeliveryapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fooddeliveryapplication"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-auth:23.2.0")
    implementation("com.google.firebase:firebase-auth-ktx:23.2.0")
    implementation("com.google.firebase:firebase-database:21.0.0")
    implementation("com.google.firebase:firebase-database-ktx:21.0.0")
    implementation("com.google.firebase:firebase-storage:21.0.1")
    implementation("com.google.firebase:firebase-storage-ktx:21.0.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.android.car.ui:car-ui-lib:2.0.0")
    implementation("com.github.ismaeldivita:chip-navigation-bar:1.4.0")
    implementation("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("com.karumi:dexter:6.2.3")
    implementation("com.github.chthai64:SwipeRevealLayout:1.4.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("com.airbnb.android:lottie:6.0.0")
    implementation("com.tbuonomo:dotsindicator:4.3")
//    implementation("com.etebarian:meow-bottom-navigation:1.2.0")
    implementation("com.github.Foysalofficial:NafisBottomNav:5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
