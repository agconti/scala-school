


/*
  - anonymous Function syntax is allowed anywhere
    a value of that Function's type is allowed.
*/
val f = (x: Int) => x > 2

ArrayUtils.filter(Array(1,2,3,4), (x: Int) => x > 2) 

val g = 
  if (keepOnlyBig) { (x: Int) => x > 2 }
  else { (x: Int) => true }

val h: Int => Boolean = 
  if (keepOnlyBig) { _ > 2 }
  else { _ => true }

