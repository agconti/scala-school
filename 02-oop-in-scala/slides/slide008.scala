

// Abstract classes

// Very standard, abstract classes cannot be instantiated.  They can define constructors, fields, and methods which may
// be concrete or abstract.  Subclasses can override concrete members unless they are private or final.

abstract class A {
  val someField: Int
  val someOtherField: Int = 123
  def someMethod(x: Int): Int
  def someOtherMethod(x: Int): Int = double(x)
  protected def foo: Int = 123
  private def double(x: Int) = x * 2
}


