package day06Collection

object Test01Array {
  def main(args: Array[String]): Unit = {
    val arr1 = new Array[Int](5)
    val arr2 = Array()
    val arr3 = Array.apply(4, 6, 5)

    arr1(0) = 88
    arr1.update(1, 55)

    println(arr1(0))
    println(arr1.apply(1))

    for (i <- arr3.indices) {
      println(arr3(i))
    }
    for(elem <- arr3) {
      println(elem)
    }
    val iter = arr3.iterator
    while (iter.hasNext) {
      println(iter.next())
    }
    arr3.foreach(i => println(i))
    arr3.foreach(println)
    println(arr3.mkString("---"))

    val newArray1 = arr3.:+(7)
    val newArray2 = arr3.+:(7)
    val newArray3 = 8 +: arr3
    val newArray4 = arr3 :+ 8
    val newArray5 = 6 +:  9 +: arr3 :+ 8
    println(newArray1.mkString("---"))
    println(newArray2.mkString("---"))
    println(newArray3.mkString("---"))
    println(newArray4.mkString("---"))
    println(newArray5.mkString("---"))
  }
}
