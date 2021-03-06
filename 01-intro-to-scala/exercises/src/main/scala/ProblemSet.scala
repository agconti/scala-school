object ProblemSet {

  // Feel free to use vars

  /*
   * Problem 1
   *
   * If we list all the natural numbers below 10 that are multiples
   * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   *
   *  Find the sum of all the multiples of 3 or 5 below 1000 and return it.
   */
  def sumOfMultiples(): Int = {
    val limit = 1000
    val multiples = (0 until limit).filter { num => num % 3 == 0 || num % 5 == 0 }

    multiples.sum
  }

  /*
   * Problem 2
   *
   * A perfect square is a number that can be expressed as the product of two
   * equal integers. Ex. 9 is a perfect square because it can be expressed as 3 * 3
   *
   * If the parameter i is a perfect square, return its square root in an Option.
   * if the parameter i is not a perfect square return an empty Option.
   *
   * If it not, then return an empty Option.
   */

  def isPerfect(i: Int): Option[Int] = {
    val perfectSquare = (1 to i).filter { num => num * num == i }

    perfectSquare.lift(0)
  }

  /*
   * Problem 3
   *
   * Return a tuple containing the size and sum of the contents of the list parameter.
   */
  def lengthAndSum(l: List[Double]): (Int, Double) = {
    l.size -> l.sum
  }

  /*
   * Problem 4
   *
   * The parameters a, b, c, d are two sets of coordinates in a 2 dimensional
   * Cartesian coordinate system where a, b are a pair and c, d are a pair.
   *
   * Inside of distance(), create two Point instances using the Point class
   * below using the parameters a, b, c, d
   *
   * Then create a Companion Object for Point with one method called "distance"
   * That method will take two parameters (the two Point instances you created above).
   * Inside that method, using the below formula, calculate the distance between them.
   *
   * Return that distance as the return value to the function below.
   *
   * Formula:
   *   The distance between two points is equal to the square root
   *   of the sum of the squares of the differences of each point.
   *
   *   In other words,
   *    - take the difference between corresponding coordinates of two Points
   *    - square that difference
   *    - repeat for each coordinate
   *    - sum all the differences
   *    - take the square root of those differences (use Math.sqrt(x))
   *
   *  http://www.calculatorsoup.com/calculators/geometry-plane/distance-two-points.php
   */

  class Point(x: Double, y: Double)

  object Point {

    def distance(a: Point, b: Point) = {
      val squareDistanceX = Math.pow((a.x - b.x), 2)
      val squareDistanceY = Math.pow((a.y - b.y), 2)

      Math.sqrt(squareDistanceX + squareDistanceY)
    }
  }

  def distance(a: Double, b: Double, c: Double, d: Double) = {
    val a: Point = new Point(a, b)
    val b: Point = new Point(c, d)

    Point.distance(a, b)
  }
}
