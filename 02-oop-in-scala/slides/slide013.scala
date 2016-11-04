

// Pattern matching

case class Rectangle(height: Double, width: Double)
val SpecificHeight = 1
def reviewRect(rect: Rectangle) = rect match {
  // Binding and guards
  case Rectangle(h, w) if w > 100 =>
    s"wide rectangle has height $h"
  // Match against constants, and bind entire object.
  case r @ Rectangle(SpecificHeight, 2) =>
    s"very specific rectangle is $r"
  case Rectangle(height, _) =>
    s"rectangle has height $height"
}

// If the last two cases were reversed, the compiler would warn us that the Rectangle(1, 2) code is unreachable because
// the local variable binding (height) and the discarded value (_) catch everything.


