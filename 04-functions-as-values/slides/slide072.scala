


object ArrayUtils {
  def filter(xs: Array[Int], pred: Int => Boolean): Array[Int] = ???

  // This function accepts a Function and returns a Function

  def filtering(pred: Int => Boolean): Array[Int] => Array[Int] = 
    xs => filter(xs, pred)
  
}

