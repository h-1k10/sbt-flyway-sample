import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.h_ikio",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "sbt-flyway-sample",
    libraryDependencies ++= Seq(scalaTest % Test)
  )

lazy val flyway =  (project in file("flyway")).
  settings(
    name := "flyway",
    organization := "com.github.h_ikio",
    scalaVersion := "2.12.3",
    version      := "0.1.0-SNAPSHOT",

    libraryDependencies ++=
      Seq(
        "org.scalikejdbc" %% "scalikejdbc" % "3.1.0",
        "mysql" % "mysql-connector-java" % "5.1.41",
        "org.flywaydb" % "flyway-core" % "4.2.0", // for Java-based migration
        scalaTest % Test
      ),

    // for flyway
    flywayUser := "root",
    flywayPassword := "",
    flywayUrl := "jdbc:mysql://localhost:3309?useSSL=false",
      flywayDriver := "com.mysql.jdbc.Driver",
    flywayLocations := Seq(
      "filesystem:./db/flyway", // for SQL-based migration
      "com.github.h_ikio.sbt_flyway_sample.migration" // for Java-based migrations
    ),
    // このschemaはflywayが自動的にcreate schemaしてくれる
    flywaySchemas := Seq("flyway_sample", "flyway_sample2")
  )