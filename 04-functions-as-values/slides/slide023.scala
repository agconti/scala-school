


object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], pred: Function1[Int,Boolean]): Array[Int] = ???
}

trait Function1[T, R] {
  def apply(x: T): R
}

