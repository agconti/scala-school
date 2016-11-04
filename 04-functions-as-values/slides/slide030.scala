


// names matter a lot
case class Customer(person: Person, email: Email)

case class HasEmail[T](x: T, email: Email)

// the types are the only game in town
case class Tuple2[A, B](_1: A, _2: B)

