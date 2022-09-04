package day07MatchCase

object Test04MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student1 = Student1("alice", 18)
    val result = student1 match {
      case Student1("alice", 18) => "alice, 18"
      case _ => "else"
    }
    println(result)
  }
}

case class Student1(name: String, age: Int)
