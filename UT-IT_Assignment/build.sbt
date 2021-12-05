ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
  "org.mockito" %% "mockito-scala" % "1.16.46" % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "UT-IT-Assignment"
  )
