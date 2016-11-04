


object Foo extends Function1[Int, Boolean] {
  def apply(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], pred: Function1[Int,Boolean]): Array[Int] = ???
}

object UseCase {
  val predicate: Function1[Int, Boolean] = Foo
  val result = ArrayUtils.filter(Array(1,2,3,4), predicate)
}

trait Function1[T, R] {
  def apply(x: T): R
}

