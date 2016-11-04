

// AnyVal
// If everything is an object, how do we deal with primitives?  They are objects that extend AnyVal, which in turn
// extends Any.

final abstract class Int private extends AnyVal
final abstract class Long private extends AnyVal
// etc

// These all have sane implementations of hashCode, equals, etc
// Conversions between primitives happen via implicits, so you can seamlessly widen a type like Int to Long, or Float to
// Double.

def withLong(x: Long) = x * 2
def withInt(x: Int) = x * 2
withLong(1: Long)  // okay, same type
withLong(1: Int)   // okay, Int is automatically converted ("widened") to a Long
withInt(1: Int)    // okay, same type
withInt(1: Long)   // fail! can't shrink a Long to an Int
//  error: type mismatch;
//  found   : Long
//  required: Int
//      withInt(1: Long)

// You can define your own value classes which, once compiled, may not use the wrapper class.  This gives the double
// benefit of using a descriptive type and still getting native speed.  This has gotchas, however -- boxing will happen
// automatically whenever needed.  See http://docs.scala-lang.org/overviews/core/value-classes.html for all the catches.

class Feet(val amount: Int) extends AnyVal {
  def +(other: Feet): Feet = new Feet(amount + other.amount)
}

new Feet(2) + new Feet(3) // No allocations required!

