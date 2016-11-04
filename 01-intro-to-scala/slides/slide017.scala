
// Control Structures : For Expressions

// Scala’s for expression is a Swiss army knife. 
// It lets you combine a few simple ingredients 
// in different ways to express a variety of enumerations. 

// For now lets just see a simple example...
for (i <- 1 to 10) {
  println(i)
}

// Ok, one neat trick.. loop guards
for {
  i <- 0 to 10
  if i % 2 == 0
} print(i + " ")

// Which prints...
0 2 4 6 8 10

// 'for' is very powerful, they are in fact 
// similar to set comprehensions. More to come..

