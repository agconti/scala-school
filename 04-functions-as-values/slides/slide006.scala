


object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], /* something */): Array[Int] = ???
}

// how can we pass the behavior of Foo.isGood
// to someone else?

