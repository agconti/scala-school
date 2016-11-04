

// Scala built-ins:

trait Function1[T, R] {
  def apply(x: T): R
}

trait Function0[R] {
  def apply(): R
}

//java
trait Callable[R] {
  def apply(): R
}

