package day05Class

object Test07 {
  def main(args: Array[String]): Unit = {
    val student: Person7 = new Worker
    println(student.name)
    student.hello()
  }
}

class Person7 {
  val name: String = "person"
  def hello(): Unit = {
    println("hello person")
  }
}

class Worker extends Person7 {
  override val name: String = "worker"
  override def hello(): Unit = {
    println("hello worker")
  }
}
