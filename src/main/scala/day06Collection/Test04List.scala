package day06Collection

object Test04List {
  def main(args: Array[String]): Unit = {
    val list = List("1", "2", "3")
    println(list)
    println(list(1))
    list.foreach(println)
  }
}
