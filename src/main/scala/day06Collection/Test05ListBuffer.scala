package day06Collection

import scala.collection.mutable.ListBuffer

object Test05ListBuffer {
  def main(args: Array[String]): Unit = {
    val list1 = ListBuffer[Int](1, 2, 3)
    println(list1)

    list1.append(4, 5, 6)
    println(list1)
    list1.prepend(0)
    println(list1)
    list1.insert(7, 7)
    println(list1)

    31 +=: 56 +=: list1 += 66
  }
}
