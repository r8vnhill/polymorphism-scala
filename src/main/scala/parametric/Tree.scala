package cl.uchile.dcc
package parametric

trait Tree[T <: Comparable[T]] {
  def find(x: T): Boolean
  def max: T
}
