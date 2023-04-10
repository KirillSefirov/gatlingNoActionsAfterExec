import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "sometests",
        scalaVersion := "2.13.8",
        version      := "0.1.0",
      ),
    ),
    name := "sometests",
    libraryDependencies ++= gatling,
    libraryDependencies ++= gelf,
    libraryDependencies ++= gatlingPicatinny,
    libraryDependencies ++= janino,
    Test / PB.targets := Seq(
      scalapb.gen() -> (Test / sourceManaged).value
    ) ,
    libraryDependencies ++= gatlingGrpc,
    libraryDependencies ++= grpcDeps,

      scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-Xfatal-warnings",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps",
    ),
  )
