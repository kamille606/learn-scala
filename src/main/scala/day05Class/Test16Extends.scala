package day05Class

object Test16Extends {
  def main(args: Array[String]): Unit = {
    println(WorkDay.MONDAY)
  }
}

object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}
object TestApp extends App {
  println("app start")
  type MyString = String
  val a : MyString = "123"
  type MyInt = Int
  val b : MyInt = 1
}