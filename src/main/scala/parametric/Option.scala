package cl.uchile.dcc
package parametric

trait Option[T] {
  def get: T
  def isEmpty: Boolean
  def getOrElse[S >: T](default: S): S
}

class A

def foo[T <: A](x: T) = ???
def bar[T >: A](x: T) = ???