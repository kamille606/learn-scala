package day06Collection

object Test11Op {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val set = Set(22, 33, 44, 55)

    println(list.length)
    println(set.size)

    for (elem <- list) {
      print(elem)
    }
    list.foreach(print)
    for (elem <- list.iterator) print(elem)

    println(list)
    println(list.mkString)
    println(list.mkString("-"))
    println(set)
    println(set.mkString)
    println(set.mkString("-"))

    println(list.contains(2))
    println(set.contains(2))

    

  }
}
