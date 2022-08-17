package day05Class

import scala.beans.BeanProperty

object Test03Class {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.getAge)
    println(student.name)
    println(student.sex)
  }
}

class Student {
  var name = "lain"
  @BeanProperty
  val age = 18
  var sex: String = _
}
