


// Lastly, Scala provides a convenience for applying a Function

trait Function1[T, R] {
  def apply(x: T): R
}

val f: Int => Boolean = _ > 2

f.apply(3) // true
f(3) // true

