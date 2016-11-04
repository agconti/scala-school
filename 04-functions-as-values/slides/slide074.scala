


// how can we pass the behavior of this method 
// to someone else ?

object ArrayUtils {

  def filter(xs: Array[Int], /* something */): Array[Int] = {
    val it = xs.iterator
    val builder = Array.newBuilder[Int]
    while (it.hasNext()) {
      val x = it.next()
      if (/* what? */) builder += x
    }
    builder.result
  }

}

