val limit = 50

(1 to limit).filter {num => num % 3 == 0 || num % 5 == 0}