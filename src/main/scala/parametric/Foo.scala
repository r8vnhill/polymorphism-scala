package cl.uchile.dcc
package parametric

class Foo(val n: Int) extends Ordered[Foo] {
  def compare(that: Foo): Int = n - that.n
}

@main def testFoo: Unit = {
  val a = Array(new Foo(3), new Foo(1), new Foo(2))
  println(a(0).n) // 3
  scala.util.Sorting.quickSort(a)
  println(a(0).n) // 1
}