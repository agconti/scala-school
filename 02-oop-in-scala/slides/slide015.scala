

// Pattern matching a sequence

// Extracting from a sequence with fancy features and symbolic operators.
List(Rectangle(1, 1), Rectangle(2, 2)) match {
  case Rectange(x, y) :: Rectangle(2, 2) if x == y => "a list of two squares where at least one has height/width of 2"
  case _ => "something else"
}


// Common case of extracting from a sequence is recursing though a list.
@annotation.tailrec
def recurseSum(z: Int, xs: List[Int]): Int =
  xs match {
    case Nil => z
    case head :: tail => recurseSum(z + head, tail)
  }


