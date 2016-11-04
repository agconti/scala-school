
// Control Structures : Exception Handling

// Exceptions are available in Scala via a 
// try-catch-finally syntax that uses 'pattern matching'.

// 'trys' are also expression-oriented!!

val result: Int = try {
  remoteCalculatorService.add(1, 2)
} catch {
  case e: ServerIsDownException => {
    log.error(e, "Remote calculator unavailable!")
    Int.MinValue
  }
} finally {
  remoteCalculatorService.close()
}

// (This is not an example of good programming style, 
// just an example of try-catch-finally resulting in 
// expressions like most everything else in Scala.)

