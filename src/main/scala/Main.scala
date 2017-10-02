import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.{Element, MouseEvent}
import ui.{<, DOMUtil}

object Main extends App {
  val el: Element = document.getElementById("app")

  DOMUtil.render(
    <.div >
      <.p.onClick((event: MouseEvent) =>
        DOMUtil.render(<.p.>("its been diffed"), el)).>("Click to diff"), el)
}
