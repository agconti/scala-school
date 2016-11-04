
// Data Structures: Tuples

// A tuple groups together simple logical 
// collections of items without using a class.

val hostPort = ("localhost", 80)
// hostPort: (String, Int) = (localhost, 80)

// They have accessors by position..
val host = hostPort._1
// host: String = localhost

val port = hostPort._2
// port: Int = 80

