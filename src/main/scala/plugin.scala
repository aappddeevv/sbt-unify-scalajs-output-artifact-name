package ttg
package scalajs

import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object UnifyScalaJSOutputArtifactName extends AutoPlugin {
  override def requires = ScalaJSPlugin

  final object autoImport {
    val unifiedName = SettingKey[String]("unifiedName", "Unified name for scala.js artifact output.")
  }
  import autoImport._

  override lazy val projectSettings = Seq(
    artifactPath.in(Compile,fastOptJS) := crossTarget.in(Compile, fastOptJS).value / (unifiedName.value + ".js"),
    artifactPath.in(Compile,fullOptJS) := crossTarget.in(Compile, fullOptJS).value / (unifiedName.value + ".js")
  )

}
