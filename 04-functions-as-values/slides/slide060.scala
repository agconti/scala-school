


// Scala provides extra special conveniences
// for converting methods ("functions") to Functions

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

val predicate: Int => Boolean = x => Foo.isGood(x)

// "invoke" a method with an _ to promote it to a Function
val predicate = Foo.isGood(_) 
// often the type is inferred

// if Scala already knows that you expect
// a Function, you can refer to the method directly:
val predicate: Int => Boolean = Foo.isGood 
// under the hood it is still making an anonymous Function!

