name := "ui"

version := "0.1"

scalaVersion := "2.12.3"

enablePlugins(ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
npmDependencies in Compile += "morphdom" -> "latest"
npmDevDependencies in Compile += "source-map-loader" -> "0.1.5"
//webpackDevServerExtraArgs := Seq("--inline")
