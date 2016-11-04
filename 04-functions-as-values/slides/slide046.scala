


// what if we don't want our object to inherit Function1 ?

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object UseCase {

  val predicate: Int => Boolean = ???

}


