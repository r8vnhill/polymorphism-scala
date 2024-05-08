package cl.uchile.dcc
package parametric

class InnerNode[T <: Comparable[T]](val value: T,
                                    val left: Tree[T],
                                    val right: Tree[T]) extends Tree[T] {
  override def max: T = {
    val innerMax = if (left.max.compareTo(right.max) > 0) left.max else right.max
    if (value.compareTo(innerMax) > 0) value else innerMax
  }

  override def find(x: T): Boolean = (value.compareTo(x) == 0) || left.find(x) || right.find(x)
}
