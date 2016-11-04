


// option 2: define an instance of an *anonymous class*

object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object UseCase {

  val predicate: Int => Boolean = 
    new Function1[Int, Boolean] {
      def apply(x: Int) = Foo.isGood(x)
    }
  
}

