plugins {
    kotlin("kapt")
}
dependencies {
    implementation(project(":port"))
    implementation("jakarta.enterprise:jakarta.enterprise.cdi-api:2.0.2")
    implementation("jakarta.transaction:jakarta.transaction-api:1.3.3")
}
