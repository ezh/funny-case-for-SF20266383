val commonSettings = Seq(libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1")

lazy val a: Project = (project in file("a")) settings(commonSettings: _*) settings(
    name := "a",
    test in Test <<= test in Test dependsOn (test in Test in b)
)

lazy val b: Project = (project in file("b")) settings(commonSettings: _*) settings(
    name := "b"
)

lazy val root: Project = (project in file(".")) settings(commonSettings: _*) settings(
    name := "root",
    test in Test <<= test in Test dependsOn (test in Test in a)
)

