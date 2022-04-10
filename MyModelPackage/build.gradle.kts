plugins {
    java
    id("software.amazon.smithy").version("0.6.0")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("software.amazon.smithy:smithy-aws-traits:1.19.0")
}

buildscript {
    dependencies {
        classpath("software.amazon.smithy:smithy-openapi:1.19.0")
        // The openapi plugin configured in the smithy-build.json example below
        // uses the restJson1 protocol defined in the aws-traits package. This
        // additional dependency must added to use that protocol.
        classpath("software.amazon.smithy:smithy-aws-traits:1.19.0")
    }
}