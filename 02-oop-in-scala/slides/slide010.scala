

// Traits are more than just interfaces with potentially concrete members; they can maintain internal state.
trait Countable {
  private var _count = 0
  def count(): Unit = _count += 1
  def showCount = _count
}
class Foo extends Countable
val f = new Foo
println(f.showCount)
1 to 3 foreach (_ => f.count())
println(f.showCount)

