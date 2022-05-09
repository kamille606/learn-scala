package day02

object Test07DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 10
    val b1: Long = 23333
    val result1: Long = a1 + b1
    val result2: Int = (a1 + b1).toInt
    val result3: Int = (a1 + b1.toInt)

    val a2: Byte = 10
    val b2: Int = a2

    val a3: Byte = 10
    val b3: Char = a3.toChar
    val c3: Int = b3
  }
}
