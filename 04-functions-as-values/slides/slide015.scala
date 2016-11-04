


trait IntFilterStrategy {
  def isGood(x: Int): Boolean
}

trait FilterStrategy[T] {
  def isGood(x: T): Boolean
}

trait Predicate[T] {
  def apply(x: T): Boolean
}

trait Function[T, R] {
  def apply(x: T): R
}

