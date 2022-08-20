package day05Class

object Test08Abstract {
  def main(args: Array[String]): Unit = {

  }
}

abstract class Person8 {
  val name: String = "person"
  var age: Int = _
  var sex: Int
  def eat(): Unit = {
    println("person eat")
  }
  def sleep(): Unit
}
class Student8 extends Person8 {
  var sex: Int = _
  def sleep(): Unit = {
    println("student sleep")
  }
  override val name: String = "student"
  age = 12
  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}