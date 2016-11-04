
// Classes: Constructors

// Constructors aren’t special methods, they are 
// the code outside of method definitions. 

class Calculator(val brand: String) {
  
  // Code executed on instance construction
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(m: Int, n: Int): Int = m + n
}

