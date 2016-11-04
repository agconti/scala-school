
// Data Structures: Options con't

// Option itself has two subclasses: Some[T] & None
// We can wrap any value in an Option using these.

val bonk = Some(4)
val baz = None
val zoop = Some(new File(""))

// They often appear in the collections library...

val numbers = Map("one" -> 1, "two" -> 2)
numbers: Map[String,Int] = Map(one -> 1, two -> 2)

val two = numbers.get("two")
two: Option[Int] = Some(2)

val three = numbers.get("three")
three: Option[Int] = None

