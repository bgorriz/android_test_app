import com.android.tools.lint.checks.ApiDetector
import sbt.Keys._

androidBuild

scalaVersion := "2.11.8"
javacOptions in Compile ++= "-source" :: "1.7" :: "-target" :: "1.7" :: Nil

platformTarget := "android-23"
proguardCache := Nil

resolvers in ThisBuild ++= Seq(
  Resolver.mavenLocal,
  Resolver.jcenterRepo
)

lazy val androidScala = project
  .in(file("."))
  .settings(
    name := "android-scala-test",
    organization := "com.wire",
    version := "0.0.1",
    platformTarget := "android-23",
    lintDetectors := Seq(ApiDetector.UNSUPPORTED),
    lintStrict := true,
    libraryDependencies ++= Seq(
      "com.android.support" % "support-v4" % "23.1.0",
      "com.android.support" % "appcompat-v7" % "23.1.0"
    )
  )

fork in Test := true