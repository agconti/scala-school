
// Classes: Properties & Methods

class Calculator {
   // An instance variable
   val brand: String = "HP"

   // An instance method
   def add(m: Int, n: Int): Int = m + n
}

val calc = new Calculator

println(calc.add(1, 2))
// prints 3

println(calc.brand)
// prints 'HP'

