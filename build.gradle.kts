import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.16"
}

fluidLibrary(name = "pdf", version = "0.10.2")

fluidLibraryModule(description = "Easy PDF generation with HTML & CSS using Chromium or Google Chrome") {
	publishSingleTargetAsModule()

	targets {
		jvm {
			dependencies {
				implementation(kotlinx("coroutines-core", "1.4.2"))
				implementation("com.github.kklisura.cdt:cdt-java-client:2.1.0")
				implementation("org.apache.pdfbox:pdfbox:2.0.21")
			}
		}
	}
}
