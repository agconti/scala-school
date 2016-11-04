

// Behind the scenes: how extractors are implemented

class Person(val age: Int)
object Adult {
  def unapply(person: Person): Option[Int] = if (person.age > 19) Some(person.age) else None
}
object Teen {
  def unapply(person: Person): Option[Int] = if (13 <= person.age && person.age <= 19) Some(person.age) else None
}
object Child {
  def unapply(person: Person): Option[Int] = if (person.age < 13) Some(person.age) else None
}

val person = new Person(25)
person match {
  case Child(_) => "child"
  case Teen(_) => "teen"
  case Adult(_) => "adult"
}
