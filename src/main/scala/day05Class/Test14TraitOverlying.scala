package day05Class

object Test14TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student: Student14 = new Student14
    student.increase()
  }
}

class Student14 extends Person12 with Talent14 with Knowledge14 {
  override def singing(): Unit = println("singing")
  override def dancing(): Unit = println("dancing")
  override def increase(): Unit = {
    super.increase()
  }
}

trait Knowledge14 {
  var amount: Int = 0
  def increase(): Unit = {
    println("Knowledge14 increase")
  }
}

trait Talent14 {
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("Talent14 increase")
  }
}
