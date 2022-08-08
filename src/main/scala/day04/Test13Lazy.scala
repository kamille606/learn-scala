package day04

object Test13Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 17)

    println("1. 函数调用")
    println("2. result:" + result)
    println("4. result:" + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }

  def sum1(a: Int)(b: Int): Int = {
    a + b
  }
}
