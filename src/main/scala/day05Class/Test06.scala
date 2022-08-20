package day05Class

object Test06 {
  def main(args: Array[String]): Unit = {
    val student: Person6 = new Student6("学生", 18)
    val teacher: Person6 = new Teacher6("老师", 38)
    student.printInfo()
    teacher.printInfo()

    personInfo(student)
    personInfo(teacher)

    def personInfo(person: Person6): Unit = {
      person.printInfo()
    }
  }
}
class Person6(var age: Int) {
  def printInfo(): Unit = {
    println(s"person $age")
  }
}
class Student6(var name:String, age:Int) extends Person6(age) {
  override def printInfo(): Unit = {
    println(s"student $name $age")
  }
}
class Teacher6(var name:String, age:Int) extends Person6(age) {
  override def printInfo(): Unit = {
    println(s"teacher $name $age")
  }
}