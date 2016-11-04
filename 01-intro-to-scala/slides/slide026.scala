
// Companion Objects

// Classes and Objects can have the same name. 
// In this case the object is called a ‘Companion Object’. 
// We commonly use Companion Objects for factories.

// Here is a trivial example that only serves 
// to remove the need to use ‘new’ to create an instance.

class Bar(foo: String)

object Bar {
  def apply(foo: String) = new Bar(foo)
}

// Now we can do...
val b: Bar = Bar("bar!")

