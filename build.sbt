name := "ui"

version := "0.1"

scalaVersion := "2.12.3"

enablePlugins(ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"