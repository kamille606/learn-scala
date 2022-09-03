package day07MatchCase

object Test03MatchObject {
  def main(args: Array[String]): Unit = {
    val student1 = new Student("alice", 18)
    val student2 = new Student("lain", 18)
    val result = student1 match {
      case Student("alice", 18) => "alice, 18"
      case _ => "else"
    }
    println(result)
  }
}

class Student(val name: String, val age: Int)

object Student {
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) None
    else Some((student.name, student.age))
  }
}