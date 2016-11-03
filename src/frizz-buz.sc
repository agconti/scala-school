
def frizz_buzz(num: Int): Any = {

  if (num % 15 == 0)
    "FrizzBuzz"

  else if (num % 5 == 0)
    "Buzz"

  else if (num % 3 == 0)
    "Frizz"

  else
    num
}

def main(limit: Int): Unit = {
  (1 to limit).foreach(frizz_buzz _ andThen println)
}


main(25)