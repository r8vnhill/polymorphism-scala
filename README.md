### Exercise: Generic Stack Implementation

**Objective:** Implement a generic `Stack` class in Scala that can handle elements of any type. The stack should support basic operations such as `push`, `pop`, and `peek`.

**Requirements:**
1. **Generic Class Definition:** Define a `Stack` class that is generic and can hold elements of any specified type.
2. **Push Method:** Implement a method to add an element to the top of the stack.
3. **Pop Method:** Implement a method to remove the top element from the stack. This method should throw an appropriate exception if the stack is empty.
4. **Peek Method:** Implement a method to return the top element without removing it, throwing an exception if the stack is empty.
5. **IsEmpty Method:** Include a method to check if the stack is empty.

### Bonus

**Objective:** Extend the generic `Stack` class to include a `map` method that creates a new stack with elements transformed by a function, which itself could potentially produce elements of a different type.

**New Requirement:**
- **Map Method:** Implement a `map` method in the `Stack` class that takes a transformation function (represented as the object](s) bellow) as a parameter. This function should transform each element of the stack from type `T` to another type `U`, resulting in a new `Stack[U]`.

```scala
trait TransformFunction[T, U] {
  def transform(t: T): U
}

class DoubleTransformFunction extends TransformFunction[Int, Double] {
  override def transform(t: Int): Double = t * 2.0
}

class StringTransformFunction extends TransformFunction[Int, String] {
  override def transform(t: Int): String = s"Number: $t"
}
```