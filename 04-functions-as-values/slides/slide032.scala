


// names matter a lot
case class Customer(person: Person, email: Email)

case class HasEmail[T](x: T, email: Email)

// the types are the only game in town
case class Tuple2[A, B](_1: A, _2: B)

// Scala can provide us lots of conveniences
// for something so universal and generic.
val c: (Person, Email) = (person, email)

// the same is true for Functions

