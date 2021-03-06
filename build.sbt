import play._
import play.PlayImport._
import play.PlayScala._

name := """ng-flow-play-sample"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" % "angularjs" % "1.3.0",
  "org.webjars" % "requirejs" % "2.1.11-1",
  "commons-io" % "commons-io" % "2.4"
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)

pipelineStages := Seq(rjs, digest, gzip)
