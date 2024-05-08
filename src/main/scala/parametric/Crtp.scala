package cl.uchile.dcc
package parametric


class Base[T] {
  // methods within Base can use template to access members of Derived
}

class Derived extends Base[Derived] {
  // methods within Derived can use template to access members of Derived
}