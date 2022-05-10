package day04

object Test01FunctionMethod {
  def main(args: Array[String]): Unit = {
    //定义函数：返回值为Unit
    def sayHi(name: String): Unit = {
      println(s"hi,${name}")
    }
    //定义函数：返回值为箭头函数
    def sayGo(name: String) = (age: String) => {
      println(s"go,${name},${age}")
    }
    //赋值箭头函数：返回值为Unit
    val sayYes = (name: String) => {
      println(s"yes,${name}")
    }
    val golang = sayGo("golang")
    golang("12")
    sayHi("alice")
    sayYes("alice")
    Test01FunctionMethod.sayHi("bob")
  }
  //定义方法：返回值为Unit
  def sayHi(name: String): Unit = {
    println(s"Hi,${name}")
  }
}
