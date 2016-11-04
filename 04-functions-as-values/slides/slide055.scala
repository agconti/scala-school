


// scala gives you tons of ways of writing *anonymous Functions*

val predicate: Int => Boolean = (x: Int) => x > 2

val predicate: Int => Boolean = x => x > 2

val predicate: Int => Boolean = _ > 2

val predicate: Int => Boolean = (_: Int) > 2  // YUCK!

val predicate: Int => Boolean = {
  case x if x > 2 => true
  case _ => false
}

