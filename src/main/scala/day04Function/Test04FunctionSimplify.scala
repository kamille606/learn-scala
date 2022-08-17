package day04Function

object Test04FunctionSimplify {
  def main(args: Array[String]): Unit = {
    //函数
    def f0(name: String): String = {
      s"hello,$name"
    }
    println(f0("alice"))

    def f1(name: String): String = {
      name
    }
    println(f1("alice"))

    def f2(name: String): String = name
    println(f2("alice"))

    def f3(name: String) = name
    println(f3("alice"))

    val f4 = (name: String) => name
    println(f4("alice"))

    def f5(name: String): Unit = {
      return name
    }
    println(f5("alice"))

    //过程
    def f6(name: String) {
      println(name)
    }
    println(f6("alice"))

    def f7(): Unit = {
      println("alice")
    }
    f7()
    f7

    def f8: Unit = {
      println("alice")
    }
    f8
    (name: String) => {
      println(name)
    }
    println("alice")
  }
}
