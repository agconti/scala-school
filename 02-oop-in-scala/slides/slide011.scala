

// Trait's "super" is bound dynamically, unlike when extending a class.  This is confusing, so just try to avoid this
// and just use override in the lowest class when necessary.

abstract class Foo { def message = "foo" }
class Bar extends Foo { override def message = super.message + " bar" }

trait T { def message: String }
trait T1 extends T { override def message = "t1" }
trait T2 extends T { override def message = "t2" }
class Concrete extends T1 with T2 // T2 takes precedence beause it's later, so message will be "t2"

trait T3 extends T { def message = "t3" }
trait T4 extends T { def message = "t4" }
class Concrete2 extends T3 with T4 {
  override def message = super[T3].message + " and " + super[T4].message + " in Concrete2"
}

