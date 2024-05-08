package cl.uchile.dcc
package parametric

class Leaf[T <: Comparable[T]](val value: T) extends Tree[T] {
  override def max: T = value

  override def find(x: T): Boolean = x.compareTo(value) == 0
}
