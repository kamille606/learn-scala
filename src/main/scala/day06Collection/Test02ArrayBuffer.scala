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
    val arr3 = 3 +: arr2 :+ 2
    println(arr2.mkString(","))
    println(arr3.mkString(","))

    val arr11 = arr1 += 19
    println(arr1)
    println(arr11)
    println(arr11 == arr1)

    76 +=: arr1
    println(arr1)

    arr1.append(22)
    arr1.prepend(11)
    arr1.insert(1, 35)
    println(arr1)

    arr1.remove(1)
    println(arr1)

    arr1 -= 11
    println(arr1)

    //可变数组转换为不可变数组
    val arr = ArrayBuffer(23, 34, 45)
    val newArr: Array[Int] = arr.toArray

    println(newArr.isInstanceOf[Array[Int]])
    println(arr)

    //可变数组转换为不可变数组
    val buffer = newArr.toBuffer
    println(buffer)
  }
}
