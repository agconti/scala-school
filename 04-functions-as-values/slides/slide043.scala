


// what if we don't want our object to inherit Function1 ?

object Foo extends Function1[Int, Boolean] {
  def apply(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], pred: Int => Boolean): Array[Int] = ???
}

object UseCase {
  val predicate: Int => Boolean = Foo
  val result = ArrayUtils.filter(Array(1,2,3,4), predicate)
}

