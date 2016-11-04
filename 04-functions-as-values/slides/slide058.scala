


// Scala provides extra special conveniences
// for converting methods ("functions") to Functions

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

val predicate: Int => Boolean = x => Foo.isGood(x)

