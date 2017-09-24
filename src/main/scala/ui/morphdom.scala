package ui

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("morphdom", JSImport.Namespace)
object morphdom extends js.Object {
  def apply(fromNode: dom.Node, toNode: dom.Node): Unit = js.native
}
