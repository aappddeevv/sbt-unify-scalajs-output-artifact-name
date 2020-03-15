package ttg
package scalajs

import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object UnifyScalaJSOutputArtifactName extends AutoPlugin {
  override def requires = ScalaJSPlugin

  final object autoImport {
    val unifiedName = SettingKey[String]("unifiedName", "Unified name for scala.js artifact output. .js is automatically appended.")
  }
  import autoImport._

  def fix(n: String) = if(n.endsWith(".js")) n else n + ".js"

  override lazy val projectSettings = Seq(
    artifactPath.in(Compile,fastOptJS) := crossTarget.in(Compile, fastOptJS).value / fix(unifiedName.value),
    artifactPath.in(Compile,fullOptJS) := crossTarget.in(Compile, fullOptJS).value / fix(unifiedName.value)
  )

}
