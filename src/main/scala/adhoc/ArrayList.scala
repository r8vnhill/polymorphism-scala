package cl.uchile.dcc
package adhoc

class ArrayList extends List {
  def add(o: Any): Unit = {
    println(s"Adding $o to the end of the list")
  }

  def add(index: Int, o: Any): Unit = {
    println(s"Adding $o at index $index")
  }
} 
