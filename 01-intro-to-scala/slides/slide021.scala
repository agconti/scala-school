
// Classes: Access Modification

// Properties and methods can have access modifiers
// similar to those in Java.

class Point(xc: Int, yc: Int) {
  private var x: Int = xc
  private var y: Int = yc
  
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  
  override def toString(): String = { 
    "(" + x + ", " + y + ")"
  }
}

// Classes can support inheritance, and 
// access modification becomes more relevant. 

