package day06Collection

import scala.collection.mutable.ArrayBuffer

object Test02ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(22, 33, 44)

    println(arr1.mkString)
    println(arr2.mkString(","))
    println(arr2)

    //println(arr1(1))

    3 +: arr2 :+ 2

    println(arr2.mkString(","))
  }
}
