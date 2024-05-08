package cl.uchile.dcc
package subtyping

import scala.language.reflectiveCalls

// NO ES NECESARIO QUE ENTIENDAN NADA DE ESTO!!!
// Define a structural type
type DuckLike = {
  def quack(): Unit
}

// A class that satisfies the DuckLike structural type
class Duck {
  def quack(): Unit = println("Quack!")
}

// Using a Duck where a DuckLike is expected
def makeSound(duckLike: DuckLike): Unit = duckLike.quack()

@main def main(): Unit =
  val duck = new Duck
  makeSound(duck)  // Works, because Duck has a quack method
