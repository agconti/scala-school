
// Control Structures : If Expressions

// Scala’s if works just like in many other languages. 
// It tests a condition and then executes one code 
// branches depending on which condition holds true. 

// Here is a common example, written in an imperative style:
var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)

// This code can be written more nicely, because Scala’s if is 
// an expression that returns a value. 

// Here is the same example in a more functional style:
val filename = if (!args.isEmpty) args(0) else "default.txt"

// Note that there is no ternary operator in Scala
val f = !args.isEmpty ? args(0) : "default.txt" // nope! 

