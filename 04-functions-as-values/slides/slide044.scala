


// what if we don't want our object to inherit Function1 ?

object Foo extends Function1[Int, Boolean] {
  def apply(x: Int): Boolean = { x % 2 == 0 }
}


