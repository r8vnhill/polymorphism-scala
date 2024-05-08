package cl.uchile.dcc
package parametric

import adhoc.Point

def process[T](x: T): T = ???

@main def testProcess(): Unit = {
  process[Point](Point(1, 2))
}