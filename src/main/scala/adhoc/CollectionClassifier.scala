package cl.uchile.dcc
package adhoc

import java.util
import scala.collection.immutable.{HashMap, HashSet, List}
import scala.collection.mutable.ListBuffer

object CollectionClassifier {
  def classify(s: Set[Any]): String =
    "Set"
  def classify(l: List[Any]): String =
    "List"
  def classify(c: Iterable[Any]): String =
    "Unknown iterable"
}

@main def testCollectionClassifier() = {
  val cols: List[Iterable[Any]] = List(
    HashSet(),
    ListBuffer(),
    HashMap()
  )
  cols.foreach(c =>
    println(CollectionClassifier.classify(c))
  )
}
