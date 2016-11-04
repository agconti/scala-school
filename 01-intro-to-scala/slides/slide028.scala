
// Data Structures: Basics

// Scala has a very generic, rich, powerful, and 
// composable collections library; collections are 
// high level and expose a large set of operations.

// Lists
val numbers = List(1, 1, 3, 4)
// numbers: List[Int] = List(1, 1, 3, 4)

// Sets
val numbers = Set(1, 1, 2)
// numbers: Set[Int] = Set(1, 2)

// Its often easy to convert between structures.
val numbers = List(1, 1, 3, 4).toSet
// numbers: Set[Int] = Set(1, 3, 4)

// By default these are all immutable! 
// There are mutable versions, but again, prefer 
// immutable unless there is a good reason.

