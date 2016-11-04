
// Unit

// All functions in Scala return a value! 
// No such thing as 'void'.

// Instead functions that are called only for 
// their 'side-effect' return a type call 'Unit'.

def print(f: String): Unit = println(s"A string is $f")
//                                   ^^^^^^^^^^^^^^^^^
//                                   String interpolation

// What does this return?
def square(i: Int) = { 
  i * i
}

// Note that if you omit the '=' before the opening curly, 
// the function returns Unit. 

