package day08

object Test01Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
    } catch {
      case e: ArithmeticException => {
        println("发生算数异常")
      }
      case e: Exception => {
        println("发生异常")
      }
    } finally {
      println("结束")
    }
  }
}
