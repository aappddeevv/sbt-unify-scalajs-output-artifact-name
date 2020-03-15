Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / organization := "ttg"
ThisBuild / description := "Sets the scala.js output artifact name to the same name for fast, full and test."
ThisBuild / licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

lazy val bintraySettings = Seq(
  bintrayRepository := "sbt-plugins",
  bintrayOrganization in bintray := None,
  bintrayReleaseOnPublish := false,
  bintrayPackageLabels := Seq("sbt", "scala", "scala.js"),
  bintrayVcsUrl := Some("git:git@github.com:aappddeevv/sbt-unify-scalajs-output-artifact-name"),
  publishMavenStyle := false,
)

lazy val root = (project in file("."))
  .settings(
    sbtPlugin := true,
    name := "sbt-unify-scalajs-output-artifact-name",
    publishMavenStyle := false,
  )
  .settings(bintraySettings)
  .settings(addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1"))
  .enablePlugins(GitVersioning)
  .enablePlugins(SbtPlugin)
