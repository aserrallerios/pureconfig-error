name := "pureconfig-test"
organization := "com.aserralle"
scalaVersion := "2.12.4"

// DEPENDENCIES

libraryDependencies ++= {
  val pureconfigV       = "0.8.0" // compilation errors with scala 2.12.4
  Seq(
    "com.github.pureconfig"      %% "pureconfig"                  % pureconfigV
  )
}
