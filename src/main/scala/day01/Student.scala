package day01

class Student(var name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + age + Student.school)
  }
}

object Student {
  val school: String = "school"
  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    alice.printInfo()
  }
}