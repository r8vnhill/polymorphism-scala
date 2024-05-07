package cl.uchile.dcc
package adhoc

class Point(var x: Int, var y: Int) {
  def moveBy(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
  }
}
