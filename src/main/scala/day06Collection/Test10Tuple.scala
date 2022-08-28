package day06Collection

object Test10Tuple {
  def main(args: Array[String]): Unit = {
    val tuple: (String, Int, Boolean) = ("hello", 100, true)
    println(tuple)

    println(tuple._1)
    println(tuple.productElement(1))

    for (elem <- tuple.productIterator) {
      println(elem)
    }

    val mulTuple = ("1", 2, true, ("3", 4))
    println(mulTuple._4._2)
  }
}
