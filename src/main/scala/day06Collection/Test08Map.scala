package day06Collection

object Test08Map {
  def main(args: Array[String]): Unit = {
    val map = Map[String, Int]("1" -> 2, "2" -> 3)
    println(map.getClass)

    val i1 = map("1")
    val i2 = map.apply("1")
    val i3 = map.get("1")
    val i4 = map.get("8")
    println(i1)
    println(i2)
    println(i3)
    println(i3.get)
    println(i4)
    println(map.getOrElse("6", 0))

    map.foreach(println)
    map.foreach((kv: (String, Int)) => {
      println(kv)
    })

    for (key <- map.keys) {
      println(s"key -${key}")
    }

  }
}
