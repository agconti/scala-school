


// Use Scala's special syntax for defining *anonymous Functions*

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object UseCase {

  val predicate: Int => Boolean = 
    (x: Int) => Foo.isGood(x)
  
}

