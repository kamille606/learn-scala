package day06Collection

import scala.collection.mutable

object Test15MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map.apply("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 7)

    println(map1 ++ map2)
    val map3 = map1.foldLeft(map2)( (map, kv) => {
      val key = kv._1
      val value = kv._2
      map(key) = map.getOrElse(key, 0) + value
      map
    })
    println(map3)
  }
}
