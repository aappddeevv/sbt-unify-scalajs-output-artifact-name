# sbt-unify-scalajs-output-artifact-name

This plugin sets the output scala.js artifact name

[ ![Download](https://api.bintray.com/packages/aappddeevv/sbt-plugins/sbt-unify-scalajs-output-artifact-name/images/download.svg?version=0.1.0) ](https://bintray.com/aappddeevv/sbt-plugins/sbt-unify-scalajs-output-artifact-name/0.1.0/link)

## Usage

Set the fast, full and test scala.js output artifact name to the same value.

To use, add the following:

```scala
// plugins.sbt
resolvers += Resolver.bintrayIvyRepo("aappddeevv", "sbt-plugins")

addSbtPlugin("ttg" % "sbt-unify-scalajs-output-artifact-name" % "<latest version here>")
```
See the badge above for the latest version.

Then in your build.sbt:

```scala
// build.sbt

lazy val subproject = project.in(file("subproject"))
	.enablePlugin(ScalaJSPlugin, UnifyScalaJSOutputArtifactName)
	.setting(unifiedName := "Scala")
```

## License

MIT license.
