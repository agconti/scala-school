def frizzBuzz(limit: Int): Unit = {
  1 to limit foreach {num =>

    if (num % 15 == 0)
      println("FrizzBuzz")
    else if (num % 3 == 0)
      println("Frizz")
    else if (num % 5 == 0)
      println("Buzz")
    else
      println(num)
  }
}


frizzBuzz(25)