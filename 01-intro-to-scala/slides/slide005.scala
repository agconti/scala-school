
// Expression-oriented Language

// Scala favors expressions over statements. 
// This idea is present in constructs throughout Scala
//   - try/catch
//   - loops
//   - return values 
//   - ...

// Note: You can turn a series of statements and 
// expressions into an expression using curly braces!

val baz = {
  val zoop = 30
  val bing = Random.nextInt()
  zoop * bing // this becomes the value of baz
}

