


trait IntFilterStrategy {
  def passesFilter(x: Int): Boolean
}

object Foo extends IntFilterStrategy {

  def passesFilter(x: Int): Boolean = { x % 2 == 0 }

}

