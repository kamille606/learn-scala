package day06Collection

object Test16WordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello java",
      "hello flink from scala"
    )
    val wordList1: List[String] = stringList.flatMap(_.split(" "))
    println(wordList1)

    val groupMap: Map[String, List[String]] = wordList1.groupBy(word => word)
    println(groupMap)

    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap)

    println(countMap.toList)
    val sortList: List[(String, Int)] = countMap.toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(sortList)
  }
}
