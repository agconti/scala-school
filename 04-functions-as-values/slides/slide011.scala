


object Foo extends IntFilterStrategy {
  def isGood(x: Int): Boolean = { x % 2 == 0 }
}

object ArrayUtils {
  def filter(xs: Array[Int], strat: IntFilterStrategy): Array[Int] = ???
}

object UseCase {
  val result = ArrayUtils.filter(Array(1,2,3,4), Foo)
}

// let's do it the Java7 way

trait IntFilterStrategy {
  def isGood(x: Int): Boolean
}


