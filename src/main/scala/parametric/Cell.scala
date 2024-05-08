package cl.uchile.dcc
package parametric

import adhoc.Point

class Cell[T] {
  private var element: Option[T] = None
  
  def content: Option[T] = element
  
  def content_=(e: T): Unit = element = Some(e)
}

//def someObscureCall(cell: Cell) = {
//  cell.content = 2
//}

@main def testCell() = {
  val c = new Cell[Point]
  val p: Point = new Point(1, 2)
  c.content = p
//  someObscureCall(c)
  val a: Point = c.content.get
  a.moveBy(1, 1)
}