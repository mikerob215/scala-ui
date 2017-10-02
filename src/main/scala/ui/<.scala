package ui

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.collection.immutable.HashMap

class <(val element: HTMLElement) {
  def className(name: String): < = {
    element.setAttribute("class", name)
    this
  }

  def id(name: String): < = {
    element.setAttribute("id", name)
    this
  }

  def >(): < = this

  def >(textContent: String): < = {
    element.appendChild(document.createTextNode(textContent))
    this
  }

  def >(children: < *): < = {
    children.foreach(child => element.appendChild(child.render))
    this
  }

  def render: HTMLElement = {
    element
  }

  def >(child: <): < = {
    element.appendChild(child.render)
    this
  }

  def style(styles: HashMap[String, String]): < = {
    var style = ""
    styles.foreach((e: (String, String)) => style += s"${e._1}: ${e._2}; ")
    println(style)
    element.setAttribute("style", style)
    this
  }

  def onClick(fn: Function[MouseEvent, Unit]): < = {
    element.onclick = fn
    this
  }

  def onMouseOver(fn: (MouseEvent) => Unit): < = {
    element.onmouseover = fn
    this
  }
}

object < {
  def div: < = new <(document.createElement("div").asInstanceOf[HTMLElement])

  def p: < = new <(document.createElement("p").asInstanceOf[HTMLElement])
}

