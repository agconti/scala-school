
// Functions & Methods

// You can create functions with 'def'.
def functionName ([list of parameters]) : [return type] = expression

// Example
def addOne(m: Int): Int = { 
  m + 1
}

// Though you may leave off the return 
// type in many cases
def addOne(m: Int) = { 
  m + 1
}

// And if the function is only one expression 
// you can leave off the curly braces
def addOne(m: Int) = m + 1

// Notes:
//  - The types of parameters must be specified
//  - 'return' is unnecessary, the last expression's value is returned

