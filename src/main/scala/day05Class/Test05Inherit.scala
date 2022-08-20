package day05Class

object Test05Inherit {
  def main(args: Array[String]): Unit = {
    val student = new Student5("123", 12, "123")
    student.printInfo()
    println(student.name)
    println(student.age)
    println(student.stdNo)
  }
}

class Person5 {
  var name: String = _
  var age: Int = _
  println("1.父类构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2.父类辅构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person:$name $age")
  }
}

class Student5(name: String, age: Int, sex: Int) extends Person5() {
  var stdNo : String = _
  println("3.子类的主构造器调用")
  def this(name: String, age: Int, stdNo:String) {
    this(name, age, 18)
    this.stdNo = stdNo
  }
}