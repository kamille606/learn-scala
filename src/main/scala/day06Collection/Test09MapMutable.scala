package day06Collection

import scala.collection.mutable

object Test09MapMutable {
  def main(args: Array[String]): Unit = {
    val map = mutable.Map("a" -> 1, "b" -> 2)
    println(map)
    println(map.getClass)
    map.foreach(println)

    map.put("c", 3)
    map += (("e", 7))
    println(map)

    map.remove("a")
    println(map)
    map -= ("b")
    println(map)

    val map2 = map ++ map
    println(map2)
  }
}
