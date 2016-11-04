
// Nested Functions

def processFile(filename: String, width: Int) {
  def processLine(line: String) {
    if (line.length > width) print(filename+": "+line)
  }

  val source = Source.fromFile(filename)
  for (line <- source.getLines) {
    processLine(line)
  }
}

// Note that 'width' is in scope in the nested function.
// Nested functions can access things in its surrounding scope!

