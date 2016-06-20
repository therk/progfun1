/**
  * Created by therk on 6/8/16.
  */
abstract class IntSet {
  def include(x: Int): IntSet
  def contains(x: Int): Boolean
  //def union(other: IntSet): IntSet

}

object EmptySet extends IntSet {
  def contains(x: Int) = false

  def include(x: Int) = new NonEmptySet(x, EmptySet, EmptySet)

}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int) = {

  }

  def include(x: Int) = {

  }
}
