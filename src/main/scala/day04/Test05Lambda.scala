package day04

object Test05Lambda {
  def main(args: Array[String]): Unit = {
    val fun1 = (name: String) => {
      println(name)
    }
    def fun2(name: String): Unit = {
      println(name)
    }

    def f(func: String => Unit): Unit = {
      func("alice")
    }
    f(fun1)
    f(fun2)
    f((name: String) => {println(name)})
  }
}
