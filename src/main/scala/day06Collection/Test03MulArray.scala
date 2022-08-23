package day06Collection

object Test03MulArray {
  def main(args: Array[String]): Unit = {
    val array:Array[Array[Int]] = Array.ofDim[Int](2, 3)

    array(0)(2) = 1
    array(1)(1) = 6
    println(array.mkString(","))
    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) {
        println()
      }
    }

    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))
  }

}
