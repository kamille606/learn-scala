package day03

import scala.language.postfixOps

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

    for (i <- Array(12, 23 ,34)) {
      println(i)
    }
    for (i <- Set(12, 23 ,34)) {
      println(i)
    }

    for (i <- 1 to 5) {
      if (i != 5) {
        println(i)
      }
    }
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    for (i <- 1 to 10 by 2) {
      println(i)
    }
    for (i <- 1 .to(10, 2)) {
      println(i)
    }
    for (i <- 1 to 10 reverse) {
      println(i)
    }
    for (i <- 10 to 1 by -1) {
      println(i)
    }

  }
}
