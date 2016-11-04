


// option 1: define your own object / class

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object UseCase {

  object FooPredicate extends Function1[Int, Boolean] {
    def apply(x: Int) = Foo.isGood(x)
  }

  val predicate: Int => Boolean = FooPredicate
  
}

