
// Classes: apply()

// A method named "apply" in Scala has 
// special semantics

// Apply methods give a syntactic sugar 
// for when a class has one main use.

class Bar {
  def apply() = "boop!"
}

val bar = new Bar

print(bar())
// Prints "boop!"

