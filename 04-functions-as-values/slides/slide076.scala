


trait IntFilterStrategy {
  def passesFilter(x: Int): Boolean
}

object Foo {

  def isGood(x: Int): Boolean = { x % 2 == 0 }

}

