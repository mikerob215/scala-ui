package ui

import org.scalajs.dom
import org.scalajs.dom.Node

object DOMUtil {
  def render(newDom: <, oldDom: Node): Unit =
    morphdom(oldDom, newDom.render)
}
