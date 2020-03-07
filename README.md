# Set the output scala.js artifact name

Set the fast, full and test scala.js output artficact name to the same value.

To use, add the following:

```scala
// plugins.sbt
resolvers += Resolver.bintrayIvyRepo("aappddeevv", "sbt-plugins")

addSbtPlugin("ttg" % "sbt-unify-scalajs-output-artifact-name" % "<latest version here>")
```

Then in your build.sbt:

```scala
// build.sbt

lazy val subproject = project.in(file("subproject"))
	.enablePlugin(ScalaJSPlugin, UnifyScalaJSOutputArtifactName)
	.setting(unifiedName := "Scala")
```

# License

MIT license.
