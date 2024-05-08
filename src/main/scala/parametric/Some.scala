package cl.uchile.dcc
package parametric

class Some[T](t: T) extends Option[T] {
  override def get: T = t
  override def isEmpty: Boolean = false
  override def getOrElse[U >: T](default: U): U = t
}