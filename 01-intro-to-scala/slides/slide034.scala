
// Data Structures: Options con't

// How do we work with Options?

// A first instinct might be to do 
// something conditionally based on 
// the isDefined method of Option.

val three = numbers.get("three")
val result = if (three.isDefined) {
  three.get * 2
} else {
  0
}

// However getOrElse lets you easily 
// define a default value.
val result = three.getOrElse(0) * 2

// We'll see later that there are lots of ways 
// to work with Options and that they are quite
// powerful. They are in fact, Monads.

