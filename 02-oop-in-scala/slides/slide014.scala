

// Pattern matching gotchas

// Uppercase/lowercase matters!
case class Rectangle(height: Double, width: Double)
val specificHeight = 1
val specificWidth = 2
Rectangle(specificHeight, specificWidth) match {
  // Beware, variables starting with lowercase letters are bound, not matched! This will fail with MatchError.
  case r @ Rectangle(specificHeight, specificWidth) =>
    s"very specific rectangle is $r"
}

// We can extract the private member, because the extractor is implemented in the companion object!
case class Secret(sequence: Int, private val msg: String)
Secret(1, "hi") match {
  case Secret(s, m) => m
}


