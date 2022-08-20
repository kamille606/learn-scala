package day05Class

object Test10Object {
  def main(args: Array[String]): Unit = {
    //val student1 = new Student10("lain", 17)
    //val student2 = new Student10()
    val student3 = Student10.newStudent("lain", 19)
    val student4 = Student10.apply("lain", 19)
    val student5 = Student10("lain", 19)//apply简写
    student3.printInfo()
    student4.printInfo()
    student5.printInfo()
  }
}

class Student10 private (val name: String, val age: Int) {
  private def this() {
    this("lain", 19)
  }
  def printInfo(): Unit = {
    println(s"student $name $age ${Student10.school}")
  }
}

object Student10 {
  val school: String = "三小"
  def newStudent(name: String, age: Int): Student10 = {
    new Student10(name, age)
  }
  def apply(name: String, age: Int): Student10 = {
    new Student10(name, age)
  }
}
