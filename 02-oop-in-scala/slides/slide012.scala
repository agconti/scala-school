

// Case classes

// case classes are essentially data classes, like a step above primitives, and are the foundation of many things you'll
// do.  Think of them like a super-powered tuple.  They are meant to contain immutable data and you get sane
// implementations of equals and hashCode which is convenient.  You also get extractors and constructors for free in the
// automatically created companion object, and a copy method.

// Normal class, just has some data.  `x` isn't a field.  Must be defined class Foo(val x: Int) to get that.
class Foo(x: Int) {
  private def peek = x
}
object Foo {
  def inspect(f: Foo) = f.peek // okay to access private member in companion object
}
object Fail {
  def inspect(f: Foo) = f.peek // not okay, won't compile because this is not a companion object.
}

case class Rectangle(height: Double, width: Double) {
  def area: Double = height * width
}
val rect = Rectangle(2, 3)
val rect2 = rect.copy(width = 500)
rect.height // constructor arguments become public fields by default; no need to specific `val`.
rect.area  // call methods normally

// msg field is still used for value equality, but has private scope.
case class Secret(sequence: Int, private val msg: String)



