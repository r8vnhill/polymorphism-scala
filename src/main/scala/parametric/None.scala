package cl.uchile.dcc
package parametric

class None extends Option[Nothing] {
  override def get: Nothing = throw new NoSuchElementException("None.get")
  override def isEmpty: Boolean = true
  override def getOrElse[S >: Nothing](default: S): S = default
}
