

// Traits

// This is how Scala deals with multiple inheritance.  Traits are similar to abstract classes in that they can have
// abstract or concrete members, but they cannot define contructors and a class can extend multiple traits.  It's common
// to "mix in" orthogonal behavior.

// A trait that is like a java interface.  No behavior is defined.
trait SimpleAction {
  def act(): Unit
}

trait MultiAction extends SimpleAction {
  def actTimes(n: Int) = 1 to n foreach (_ => act())
}

class Hi1 extends MultiAction {
  def act(): Unit = println("hi")
}

trait HiAction extends SimpleAction {
  def act(): Unit = println("hi")
}

class Hi2 extends MultiAction with HiAction

trait Logging {
  def log(msg: String): Unit = println(msg)
}

class Hi3 extends MultiAction with HiAction with Logging

