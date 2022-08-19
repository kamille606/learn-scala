package day05Class

import scala.beans.BeanProperty

object Test03Class {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.getAge)
    println(student.age)
    println(student.name)
    println(student.sex)
    student.Student()

    val student1 = new Student("名字")
    println(student1)
    val student2 = new Student("名字", "男")
    println(student2)
  }
}

class Student {
  var name = "lain"
  @BeanProperty
  val age = 18
  var sex: String = _

  println("主构造器")
  def this(name: String) {
    this()//调用主构造器
    println("副构造器1")
    this.name = name
  }

  def this(name: String, sex: String) {
    this(name)//调用主构造器
    println("副构造器2")
    this.sex = sex
  }

  def Student(): Unit = {
    println("一般方法")
  }
}
