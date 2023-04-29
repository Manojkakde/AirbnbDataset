ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "AirbnbDatasetCleaning"

  )
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.2"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "3.3.2"