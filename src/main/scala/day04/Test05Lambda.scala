package day04

object Test05Lambda {
  def main(args: Array[String]): Unit = {
    val fun1 = (name: String) => {
      println(name)
    }
    def fun2(name: String): Unit = {
      println(name)
    }

    def f(func: String => Unit, name: String): Unit = {
      func(name)
    }
    f(fun1, "函数=匿名函数(lambda)")
    f(fun2, "函数")
    f((name: String) => {println(name)}, "匿名函数(lambda)")
  }
}
