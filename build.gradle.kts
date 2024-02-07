import org.gradle.api.JavaVersion.*

plugins {
   id("java")
   id("idea")
}

java {
   sourceCompatibility = VERSION_18
   targetCompatibility = VERSION_18
}

tasks {
   "test"(Test::class) {
      useJUnitPlatform()
      testLogging {
         events("passed", "skipped", "failed")
      }
   }
}

repositories {
   mavenCentral()
}

dependencies {
   testImplementation(platform("org.junit:junit-bom:5.10.2"))
   testImplementation("org.junit.jupiter:junit-jupiter")
   testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}