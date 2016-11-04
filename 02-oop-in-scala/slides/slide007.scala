

// Basic Inheritance

class Number(val value: Int) {
  override def toString = s"The Number $value"
  def plus(other: Number) = new Number(value + other.value)
  def surpriseMe = new Number(value + 1)
}
class One extends Number(1)
class Magic extends Number(2) {
  override def surpriseMe = super.surpriseMe.plus(new Number(1000))
}

val one = new One
one.isInstanceOf[One]    // true
one.isInstanceOf[Number] // true as well

