ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.1"

lazy val root = (project in file("."))
  .settings(
    name := "polymorphism-scala",
    idePackagePrefix := Some("cl.uchile.dcc")
  )
