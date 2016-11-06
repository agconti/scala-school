val limit = 50
val i = 9

(1 to limit).filter {num => num % 3 == 0 || num % 5 == 0}

val nums = (1 to i).filter {num => num * num == i}

nums.lift(0)
