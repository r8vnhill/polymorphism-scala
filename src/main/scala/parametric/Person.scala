package cl.uchile.dcc
package parametric

class Person(val name: String, val age: Int) extends Comparable[Person] {
  override def compareTo(o: Person): Int = age.compareTo(o.age)

  override def toString: String = s"Person($name, $age)"
}

@main def main(): Unit = {
  val tree: Tree[Person] = new InnerNode[Person](
    new Person("Juan", 20),
    new Leaf[Person](new Person("Pedro", 30)),
    new Leaf[Person](new Person("Maria", 25)),
  )
  println(tree.max)
  println(tree.find(new Person("Pedro", 30)))
  println(tree.find(new Person("Pedro", 31)))
}