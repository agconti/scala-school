


object Foo {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], pred: Int => Boolean): Array[Int] = ???
}

object UseCase {
  // short and sweet
  val result = ArrayUtils.filter(Array(1,2,3,4), Foo.isGood) 
}

