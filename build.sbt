sbtPlugin := true

name := "sbt-api-mappings"

organization := "com.thoughtworks.sbt-api-mappings"

description := "A Sbt plugin that fills apiMappings for common Scala libraries."

homepage := Some(url(raw"""https://github.com/ThoughtWorksInc/${name.value}"""))

startYear := Some(2015)

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

scmInfo := Some(ScmInfo(
  url(raw"""https://github.com/ThoughtWorksInc/${name.value}"""),
  raw"""scm:git:https://github.com/ThoughtWorksInc/${name.value}.git""",
  Some(raw"""scm:git:git@github.com:ThoughtWorksInc/${name.value}.git""")))

pomExtra :=
  <developers>
    <developer>
      <id>Atry</id>
      <name>杨博</name>
      <timezone>+8</timezone>
      <email>pop.atry@gmail.com</email>
    </developer>
  </developers>