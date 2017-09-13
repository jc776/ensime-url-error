scalaVersion in ThisBuild := "2.12.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.1.1"

import org.ensime.EnsimeKeys
EnsimeKeys.ensimeServerVersion in ThisBuild := "2.0.0-M4"
EnsimeKeys.ensimeIgnoreMissingDirectories in ThisBuild := true