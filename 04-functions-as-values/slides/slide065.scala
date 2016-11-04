


/*
  you can call a *value* as though it was a *method*
  as long as it has an apply method.

  This rule applies to any object in scala, not just
  Functions
*/
object NotAFunction {
  def apply(x: Int): Int = 2 * x
}

val butYouCanCallIt: Int = NotAFunction(42)


