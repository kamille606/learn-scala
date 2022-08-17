package day04Function

object Test03FunctionParameter {
  def main(args: Array[String]): Unit = {
    def f1(str: String*): Unit = {
      println(str)
    }
    def f2(str1: String, str2: String*): Unit = {
      println(str1)
      println(str2)
    }
    def f3(name: String = "alice"): Unit = {
      println(s"name:${name}")
    }
    def f4(name: String = "alice", age: Int): Unit = {
      println(s"${age}岁的${name}")
    }
    f1("alice", "aaa")
    f2("alice", "aaa")
    f3()
    f3("tom")
    f4(age = 24, name = "tom")
    f4(age = 24)

  }
}
