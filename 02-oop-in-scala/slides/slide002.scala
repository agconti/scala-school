

// Scala is a _multi-paradigm_ language, meaning that it combines both object-oriented and functional traits.  We're
// going to focus on the object-oriented features.  They are intended to help us write large programs effectively.

// There are various definitions of object-oriented programs.  Here's one that fits for Scala:
//   A programming paradigm based on objects (classes) that encapsulate data and methods which may operate on the data in
//   the class instance via an implicit _this_ pointer.  Method dispatch is dynamic based on the class.  Modularity is
//   achieved via packages and classes.

// All values in Scala are objects. Things that look like operators, like `+`, are actually methods defined on Int.
1 + 2  // == 3
1.+(2) // The plus symbol here is just an infix method!  Any method can be used with infix notation; just pass a tuple
       // if it takes more than one argument.
// Other languages usually have operators implemented directly, and you may not be able to change them or add more.
// Don't get carried away with operator overloading though; it's normally a bad idea because named methods are more
// clear.

