


// pop quiz
type F1 = (Int, Int) => Double
        = Function2[Int, Int, Double]

type F2 = ((Int, Int)) => Double
        = Function1[(Int, Int), Double]

/*
  in fact Scala provides you 
  conveniences to transform between these.
*/
trait Function2[A, B, R] {
  def apply(x1: A, x2: B): R
  def tupled: Function1[(A,B), R]
}
object Function {
  def untupled[A,B](f2: Function1[(A,B),R]): Function2[A,B,R]
}

