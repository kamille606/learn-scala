package day03

object Test01ForLoop {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      println(i)
    }
    for (i <- 1.to(10)) {
      println(i)
    }
    for (i <- Range(1, 10)) {
      println(i)
    }
    for (i <- 1 until 10) {
      println(i)
    }

  }
}
