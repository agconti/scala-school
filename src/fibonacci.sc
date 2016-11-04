def fib (num: Int): Int = {
  num match {
    case 0 | 1 => num
    case _ => fib(num - 1) + fib(num - 2)
  }
}

fib(9)
