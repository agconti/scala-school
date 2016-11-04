


object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], pred: Int => Boolean): Array[Int] = ???
}

object UseCase {
  val predicate: Int => Boolean = x => Foo.isGood
  val result = ArrayUtils.filter(Array(1,2,3,4), predicate) 
}

