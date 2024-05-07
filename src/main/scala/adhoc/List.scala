package cl.uchile.dcc
package adhoc

trait List {
  def add(o: Any): Unit
  def add(index: Int, o: Any): Unit
}

@main def testList(): Unit = {
  val l: List = ArrayList()
  l.add(new Point(1, 2))
  l.add(3, new Point(3, 4))
}
