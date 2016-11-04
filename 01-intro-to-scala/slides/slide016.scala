
// Control Structures : While Expressions

// Scala’s while loop behaves just like in other languages. 
// Here’s an example that computes the GCD:

def gcd(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a 
    a = b % a
    b = temp
  }
  b 
}

// While loops are expressions that return Unit! 
// Therefore, challenge while loops in the same 
// way you challenge vars. 

// The more functional approach...
def gcd(a: Long, b: Long): Long = if (b == 0) a else gcd(b, a % b)





