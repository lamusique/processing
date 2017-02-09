name := "complete"
organization := "org.processing"

version := "3.1.2"

scalaVersion := "2.11.8"

lazy val commonSettings = Seq(
  organization := "org.processing",
  version := "3.1.2",
  scalaVersion := "2.11.8"
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

