
// General

organization := "org.example"

name := """hello-sbt"""

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions += "-deprecation"


resolvers ++= Seq(
    "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    "typesafe" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

// Code Formatting

scalariformSettings


// Testing

libraryDependencies ++= Seq(
    "com.typesafe.play" %% "play-slick" % "2.0.0",
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "mysql" % "mysql-connector-java" % "5.1.39",
    "com.typesafe.slick" %% "slick-codegen" % "3.1.1",
    "org.scala-lang" % "scala-reflect" % "2.11.7",
    "ch.qos.logback" % "logback-classic" % "1.1.4"
)

// Publishing

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <url>http://org.example/hello-sbt</url>
    <licenses>
      <license>
        <name>CC0 1.0 Universal</name>
        <url>https://github.com/exampleorg/hello-sbt/blob/master/LICENSE</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:exampleorg/hello-sbt.git</url>
      <connection>scm:git:git@github.com:exampleorg/hello-sbt.git</connection>
    </scm>
    <developers>
      <developer>
        <id>mr-activator</id>
        <name>Mr. Activator</name>
        <url>http://org.example/mr-activator</url>
      </developer>
    </developers>



fork in run := true
