

// Scala built-ins:

trait Function1[T, R] {
  def apply(x: T): R
}

trait Function2[T1, T2, R] {
  def apply(x1: T1, x2: T2): R
}

trait Function3[T1, T2, T3, R] {
  def apply(x1: T1, x2: T2, x3: T3): R
}

/* ... */

trait Function22[T1, ..., T22, R] {
  def apply(x1: T1, ..., x22: T22): R
}

