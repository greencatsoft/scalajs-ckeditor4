name := "scalajs-ckeditor4"

description in ThisBuild := "Scala.js wrapper API for CKEditor 4."

organization in ThisBuild := "com.greencatsoft"

version in ThisBuild := "0.1-SNAPSHOT"

homepage in ThisBuild := Some(url("http://github.com/greencatsoft/scalajs-ckeditor4"))

licenses in ThisBuild := Seq("Apache License 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

pomExtra in ThisBuild := (
  <scm>
    <url>git@github.com:greencatsoft/scalajs-ckeditor4.git</url>
    <connection>scm:git:git@github.com:greencatsoft/scalajs-ckeditor4.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mmx900</id>
      <name>Soyu Kim</name>
      <url>http://github.com/mmx900</url>
    </developer>
  </developers>
)

resolvers in ThisBuild += Resolver.sonatypeRepo("snapshots")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if(isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

pomIncludeRepository := { _ => false }

val scalaSettings = Seq(
  scalaVersion := "2.12.7",
  scalacOptions ++= Seq("-feature","-deprecation"),
  unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil,
  unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil)

lazy val ckeditor = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.6",
      "com.github.japgolly.scalacss" %%% "core" % "0.5.5"
    ),
    scalaSettings
  )
  .enablePlugins(ScalaJSPlugin)
