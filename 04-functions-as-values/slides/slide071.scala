


  def biggerThan(n: Int): Int => Boolean = { x => x > n }
  /*
    The body of a Function can contain references to
    *any* values or variables that exist in the scope in
    which the Function was *defined*.

    This property is known as "closing" over the scope.
    Functions are sometimes known as closures
  */

