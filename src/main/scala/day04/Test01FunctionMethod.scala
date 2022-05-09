package day04

object Test01FunctionMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit = {
      println(s"hi,${name}")
    }
    def sayGo(name: String) = (age: String) => {
      println(s"go,${name},${age}")
    }
    val sayYes = (name: String) => {
      println(s"yes,${name}")
    }
    val golang = sayGo("golang")
    golang("12")
    sayHi("alice")
    sayYes("alice")
    Test01FunctionMethod.sayHi("bob")
  }
  //定义方法
  def sayHi(name: String): Unit = {
    println(s"Hi,${name}")
  }
}
