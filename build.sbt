name := "complete"
organization := "org.processing"

version := "3.5.3"

scalaVersion := "2.13.1"
scalacOptions += "-target:jvm-11"

// a normal way to build with ant
// $ export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
// $ cd ./build
// $ build run

// all build.xml files
// ./core/methods/build.xml
// ./core/build.xml
// ./app/build.xml
// ./java/build.xml
// ./java/libraries/svg/build.xml
// ./java/libraries/net/build.xml
// ./java/libraries/io/build.xml
// ./java/libraries/pdf/build.xml
// ./java/libraries/dxf/build.xml
// ./java/libraries/serial/build.xml
// ./build/jre/build.xml
// ./build/build.xml
// ./build/shared/tools/MovieMaker/build.xml
// ./build/macosx/appbundler/build.xml

// only projects to build
// <target name="subprojects-clean">
//    <subant buildpath="../core" target="clean"/>
//    <subant buildpath="../app" target="clean"/>
//    <subant buildpath="../java/libraries/dxf" target="clean"/>
//    <subant buildpath="../java/libraries/io" target="clean"/>
//    <subant buildpath="../java/libraries/net" target="clean"/>
//    <subant buildpath="../java/libraries/pdf" target="clean"/>
//    <subant buildpath="../java/libraries/serial" target="clean"/>
//    <subant buildpath="../java/libraries/svg" target="clean"/>
//    <subant buildpath="shared/tools/MovieMaker" target="clean"/>
//    <subant buildpath="../java" target="clean"/>


lazy val commonSettings = Seq(
  organization := "org.processing",
  version := "3.5.3",
  scalaVersion := "2.13.1"
)


lazy val root = (project in file(".")).
  aggregate(core, svg)

//lazy val core = (project in file("core")).
lazy val core = project.
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val svg = (project in file("java/libraries/svg")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

