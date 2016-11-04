
// Singleton Objects con't

// Objects are often used for factories.

object Timer {
  private var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

// Which can later be used in a similar manner to 
// the static methods in Java

Timer.currentCount()

