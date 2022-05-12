package day04

object Test02FunctionDefine {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("无参数，无返回值")
    }
    def f2(): Int = {
      println("无参数，有返回值")
      return 12
    }
    def f3(name: String): Unit = {
      println("有参数，无返回" + name)
    }
    def f4(name: String): String = {
      println("有参数，有返回")
      s"hi,${name}"
    }
    def f5(name: String, age: Int): Unit = {
      println("多参数，无返回")
      println(s"hi,${name}, ${age}")
    }
    def f6(a: Int, b: Int): Int = {
      a + b
    }
    println(f1())
    println(f2())
    println(f3("alice"))
    println(f4("alice"))
    println(f5("alice", 12))
    println(f6(2, 12))
  }
}
