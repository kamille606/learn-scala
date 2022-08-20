package day05Class

object Test12Trait {
  def main(args: Array[String]): Unit = {
    val student1 = new Student12
    student1.sayHello()
    student1.study()
    student1.dating()
    student1.play()
  }
}

class Person12 {
  val name: String = "person"
  var age: Int = 18
  def sayHello(): Unit = {
    println(s"hello from $name")
  }
  def increase(): Unit = {
    println("Person12 increase")
  }
}

trait Young {
  val name: String = "young"
  var age: Int
  def play(): Unit = {
    println("young play")
  }
  def dating(): Unit
}

class Student12 extends Person12 with Young {
  age = 12
  override val name: String = "student"
  def dating(): Unit = {
    println(s"student $name dating")
  }
  def study(): Unit = {
    println(s"student $name study")
  }
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"student $name $age hello")
  }
}