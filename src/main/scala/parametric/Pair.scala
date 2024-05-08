package cl.uchile.dcc
package parametric

class Pair[A, B](val left: A, val right: B)

@main def testPair(): Unit = {
  val p = Pair(1, "one")
  println(p.left)
  println(p.right)
}