


// exercise to the reader: which ones compile without the type annotation?

val predicate = (x: Int) => x > 2

val predicate = x => x > 2

val predicate = _ > 2

val predicate = (_: Int) > 2  // YUCK!

val predicate = {
  case x if x > 2 => true
  case _ => false
}

