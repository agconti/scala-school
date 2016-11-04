

// Scala's type hierarchy

// Scala supports class-based inheritance.  Every class extends from `Any`.  You can think of Any as the "highest" type.

class Foo
val f = new Foo
f.isInstanceOf[Any] // true

// `Any` gives you the most basic interface:
final def ==(that: Any): Boolean
final def !=(that: Any): Boolean
def equals(that: Any): Boolean
def ##: Int
def hashCode: Int
def toString: String


