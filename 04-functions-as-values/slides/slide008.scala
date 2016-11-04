


object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], /* something */): Array[Int] = ???
}

// let's do it the Java7 way

trait IntFilterStrategy {
  def isGood(x: Int): Boolean
}

