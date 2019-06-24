import sbt._

object Dependencies {

  object Versions {
    val lettuce    = "5.1.7.RELEASE"
    val logback    = "1.2.3"

    val betterMonadicFor = "0.3.0"
    val kindProjector    = "0.10.3"

    val scalaCheck = "1.14.0"
    val scalaTest  = "3.0.8"
  }

  object Versions212 {
    val cats       = "1.6.1"
    val catsEffect = "1.3.1"
    val fs2        = "1.0.5"
    val log4cats   = "0.3.0"
  }
  
  object Versions213 {
    val cats       = "2.0.0-M4"
    val catsEffect = "2.0.0-M4"
    val fs2        = "1.1.0-M1"
    val log4cats   = "0.4.0-M1"
  }

  object Libraries {
    val redisClient = "io.lettuce" % "lettuce-core" % Versions.lettuce

    val logback = "ch.qos.logback" % "logback-classic" % Versions.logback

    // Compiler plugins
    val betterMonadicFor = "com.olegpy"     %% "better-monadic-for" % Versions.betterMonadicFor
    val kindProjector    = "org.typelevel" %% "kind-projector"      % Versions.kindProjector

    // Scala test libraries
    val scalaCheck  = "org.scalacheck" %% "scalacheck" % Versions.scalaCheck
    val scalaTest   = "org.scalatest"  %% "scalatest"  % Versions.scalaTest
  }

  object Libraries213 {
    def log4cats(artifact: String): ModuleID = "io.chrisdavenport" %% s"log4cats-$artifact" % Versions213.log4cats

    val catsEffect  = "org.typelevel" %% "cats-effect" % Versions213.catsEffect
    val fs2Core     = "co.fs2"        %% "fs2-core"    % Versions213.fs2

    val log4CatsCore  = log4cats("core")
    val log4CatsSlf4j = log4cats("slf4j")

    val catsLaws    = "org.typelevel"  %% "cats-core"    % Versions213.cats
    val catsTestKit = "org.typelevel"  %% "cats-testkit" % Versions213.cats
  }

  object Libraries212 {
    def log4cats(artifact: String): ModuleID = "io.chrisdavenport" %% s"log4cats-$artifact" % Versions212.log4cats

    lazy val catsEffect  = "org.typelevel" %% "cats-effect" % Versions212.catsEffect
    lazy val fs2Core     = "co.fs2"        %% "fs2-core"    % Versions212.fs2

    val log4CatsCore  = log4cats("core")
    val log4CatsSlf4j = log4cats("slf4j")

    val catsLaws    = "org.typelevel"  %% "cats-core"    % Versions212.cats
    val catsTestKit = "org.typelevel"  %% "cats-testkit" % Versions212.cats
  }
}
