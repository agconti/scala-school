


object ArrayUtils {
  def filter(xs: Array[Int], pred: Int => Boolean): Array[Int] = ???
  def map(xs: Array[Int], f: Int => Int): Array[Int] = ???


  def filtering(pred: Int => Boolean): Array[Int] => Array[Int] = 
    xs => filter(xs, pred)

  def mapping(f: Int => Int): Array[Int] => Array[Int] = 
    xs => map(xs, f) 
}

object UseCase {

  val multiplyBy2 = ArrayUtils.mapping(_ * 2)
  val filterDivBy3 = ArrayUtils.filtering(_ % 3 == 0)

  val pipeline: Array[Int] => Array[Int] =
    filterDivBy3 andThen multiplyBy2

}

