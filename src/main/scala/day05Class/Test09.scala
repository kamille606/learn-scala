package day05Class

object Test09 {
  def main(args: Array[String]): Unit = {
    val person: Person9 = new Person9 {
      override var name: String = "匿名子类"
      override def eat(): Unit = {
        println("person eat")
      }
    }
    person.eat()
  }
}
abstract class Person9 {
  var name: String
  def eat(): Unit
}