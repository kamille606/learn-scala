package day05Class

import scala.beans.BeanProperty

object Test04Params {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher
    println(s"name = ${teacher.getName}, age = ${teacher.getAge}")
    val teacher2 = new Teacher2("lain2", 20)
    println(s"name = ${teacher2.name}, age = ${teacher2.age}")
    val teacher3 = new Teacher3("lain3", 20)
    //println(s"name = ${teacher3.name}, age = ${teacher3.age}")
    teacher3.printInfo()
    val teacher5 = new Teacher5("lain5", 20)
    println(s"name = ${teacher5.name}, age = ${teacher5.age}")
  }
}


class Teacher {
  @BeanProperty
  var name: String = _
  @BeanProperty
  var age: Int = _
}

class Teacher2(var name: String, var age: Int) {
  var sex: String = _
  def this(sex: String) {
    this("lain", 20)
    this.sex = sex
  }
}

class Teacher3(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"name = ${name}, age = ${age}")
  }
}

class Teacher4(_name: String, _age: Int) {
  var name: String = _name
  var age: Int = _age
}

class Teacher5(val name: String, val age: Int)