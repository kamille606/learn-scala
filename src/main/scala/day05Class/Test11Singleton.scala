package day05Class

object Test11Single {
  def main(args: Array[String]): Unit = {
    val student1 = Student11.getInstance()
    val student2 = Student11.getInstance()

    println(student1)
    println(student2)
  }
}

class Student11 private (val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student $name $age ${Student10.school}")
  }
}

//饿汉单例
object Student11 {
  private val student: Student11 = new Student11("lain", 18)
  def getInstance(): Student11 = student
}

//懒汉单例
//object Student11 {
//  private var student: Student11 = _
//  def getInstance(): Student11 = {
//    if (student == null) {
//      student = new Student11("lain", 18)
//    }
//    student
//  }
//}