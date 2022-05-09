package day03

import scala.util.control.Breaks
import scala.util.control.Breaks._

object Test06Break {
  def main(args: Array[String]): Unit = {
    try {
      for (i <- 0 to 4) {
        if (i == 3)
          throw new RuntimeException()
        println(i)
      }
    } catch {
      case e: Exception =>
    }

    Breaks.breakable(
      for (i <- 0 to 4) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )

    breakable(
      for (i <- 0 to 4) {
        if (i == 3)
          break()
        println(i)
      }
    )

  }
}
