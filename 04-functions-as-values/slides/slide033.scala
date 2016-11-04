


// the type
Function1[A,B]
// can be written as
A => B

object ArrayUtils {
  def filter(xs: Array[Int], pred: Function1[Int,Boolean]): Array[Int] = ???
}

