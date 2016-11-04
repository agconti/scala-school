


// names matter a lot
trait IntFilterStrategy {
  def isGood(x: Int): Boolean
}

// the types are the only game in town
trait Function1[T, R] {
  def apply(x: T): R
}

