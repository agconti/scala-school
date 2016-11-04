import org.scalactic.TolerantNumerics
import org.scalatest._

class ProblemSetSpec extends FlatSpec with Matchers {

  import ProblemSet._

  // Problem 1
  "Sum of multiples of 3 and 5" should "be equal to" in {
    assert(sumOfMultiples() === 233168)
  }

  // Problem 2
  "Perfect squares " should "be detected" in {
    val x = isPerfect(9).getOrElse(-1)
    assert(x === 3)

    val y = isPerfect(10).getOrElse(-1)
    assert(y === -1)
  }

  // Problem 3
  "Length and sum of the list" should "be equal to" in {
    val epsilon = 1e-4f
    implicit val doubleEq = TolerantNumerics.tolerantDoubleEquality(epsilon)

    val t = lengthAndSum(List(2, 2, 2, 2, 2))
    assert(t._1 === 5)
    assert(t._2 === 10.0)
  }

  // Problem 4
  "Euclidean distance" should "be equal to" in {
    val epsilon = 1e-4f
    implicit val doubleEq = TolerantNumerics.tolerantDoubleEquality(epsilon)

    assert(distance(1, 2, 2, 1) === 1.414214)
  }

}
