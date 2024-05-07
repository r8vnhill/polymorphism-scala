package cl.uchile.dcc
package adhoc

class Display {
  def paint(p: Point): Unit = 
    println(s"Painting point at $p")
  def paint(t: Triangle): Unit = 
    println(s"Painting triangle at $t")
}

@main def testDisplay(): Unit = {
  val d = new Display
  d.paint(Point(1, 2))
  d.paint(Triangle(Point(1, 2), Point(3, 4), Point(5, 6)))
}