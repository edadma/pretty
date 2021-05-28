name := "pretty"

version := "0.1.0"

scalaVersion := "2.13.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:existentials"
)

organization := "xyz.hyperreal"

publishTo := Some(
  "Artifactory Realm" at "https://hyperreal.jfrog.io/artifactory/default-maven-virtual"
)

credentials += Credentials(
  "Artifactory Realm",
  "hyperreal.jfrog.io",
  "edadma@gmail.com",
  "fW6N-hDhW*XPXhMt"
)

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "Hyperreal Repository" at "https://dl.bintray.com/edadma/maven"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.13.0"
)

mainClass := Some(
  "xyz.hyperreal." + name.value.replace('-', '_') + ".Main"
)

publishMavenStyle := true

Test / publishArtifact := false

pomIncludeRepository := { _ => false }

licenses := Seq("ISC" -> url("https://opensource.org/licenses/ISC"))

homepage := Some(url("https://github.com/edadma/" + name.value))

pomExtra :=
  <scm>
    <url>git@github.com:edadma/{name.value}.git</url>
    <connection>scm:git:git@github.com:edadma/{name.value}.git</connection>
  </scm>
  <developers>
    <developer>
      <id>edadma</id>
      <name>Edward A. Maxedon, Sr.</name>
      <url>https://github.com/edadma</url>
    </developer>
  </developers>
