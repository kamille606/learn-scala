package day04Function

object Test11ControlAbstraction {
  def main(args: Array[String]): Unit = {
    //传值参数
    def f0(a: Int): Unit = {
      println("a:" + a)
      println("a:" + a)
    }
    f0(23)

    def f1(): Int = {
      println("f1调用")
      12
    }
    f0(f1())

    println("=============")

    //传名参数
    def f2(a: => Int): Unit = {
      println("a:" + a)
      println("a:" + a)
    }
    f2(12)
    f2(f1())
    f2({
      println("代码块")
      3
    })
  }
}
