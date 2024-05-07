package cl.uchile.dcc
package parametric

import adhoc.Point

class Cell {
  private var element: Option[Any] = None
  
  def content: Option[Any] = element
  
  def content_=(e: Any): Unit = element = Some(e)
}

def someObscureCall(cell: Cell) = {
  cell.content = 2
}

@main def testCell() = {
  val c = new Cell
  val p: Point = Point(1, 2)
  c.content = p
  /* ... */
  val a: Point = c.content.get.asInstanceOf[Point]
  a.moveBy(1, 1)
}