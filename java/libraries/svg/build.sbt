name := "svg"
organization := "org.processing"

version := "3.1.2"

scalaVersion := "2.11.8"


javaSource in Compile := baseDirectory.value / "src"


// http://mvnrepository.com/artifact/org.processing
//libraryDependencies += "org.processing" % "processing-complete" % "3.0"

// Checking the POM file
// https://repo1.maven.org/maven2/org/processing/core/3.1/core-3.1.pom
//libraryDependencies += "org.processing" % "core" % "3.1.1" withSources()
//libraryDependencies += "org.jogamp.jogl" % "jogl-all" % "2.3.2"
//libraryDependencies += "org.jogamp.jogl" % "jogl-all-main" % "2.3.2"
//libraryDependencies += "org.jogamp.gluegen" % "gluegen-rt" % "2.3.2"
//libraryDependencies += "org.jogamp.gluegen" % "gluegen-rt-main" % "2.3.2"

//libraryDependencies += "org.processing" % "pdf" % "3.1.1" withSources()
//libraryDependencies += "com.lowagie" % "itext" % "4.2.1" withSources()

//libraryDependencies += "org.processing" % "svg" % "3.1.1" withSources()

//libraryDependencies += "org.processing" % "processing-complete" % "3.1.1" withSources()


libraryDependencies += "org.apache.xmlgraphics" % "batik-awt-util" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-dom" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-ext" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-svggen" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-util" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-xml" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "batik-dom" % "1.8"



