package day06Collection

object Test17WordCount2 {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 4),
      ("hello java", 1),
      ("hello flink from scala", 2)
    )
    val newStringList = tupleList.map(kv => {
      (kv._1.trim + " ") * kv._2
    })
    println(newStringList)

    val wordCountList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList.sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)

    val value = tupleList.flatMap(tuple => {
      tuple._1.split(" ").map(word => (word, tuple._2))
    }).groupBy(tuple => tuple._1)
      .transform((k, v) => v.map(_._2))
      .map(kv => (kv._1, kv._2.sum))
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(value)
  }
}
