


trait IntFilterStrategy {
  def passesFilter(x: Int): Boolean
}

object ArrayUtils {

  def filter(xs: Array[Int], f: IntFilterStrategy): Array[Int] = {
    val it = xs.iterator
    val builder = Array.newBuilder[Int]
    while (it.hasNext()) {
      val x = it.next()
      if (f.passesFilter(x)) builder += x
    }
    builder.result
  }

}

