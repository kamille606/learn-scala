package day03

import scala.collection.immutable
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

    for (i <- Array(12, 23, 34)) {
      println(i)
    }
    for (i <- Set(12, 23, 34)) {
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
    for (i <- 1.to(10, 2)) {
      println(i)
    }
    for (i <- 1 to 10 reverse) {
      println(i)
    }
    for (i <- 10 to 1 by -1) {
      println(i)
    }

    for (i <- 1 to 10; j <- 1 to 5) {
      println(s"i:${i},j:${j}")
    }
    for (i <- 1 to 10; j = i + 1) {
      println(s"i:${i},j:${j}")
    }

    val a: Unit = for (i <- 1 to 10) {
      println(i)
    }
    println(a)

    //返回数组
    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * i
    println(b)

    var num = 1
    while (num <= 10) {
      num += 1
    }

    do {
      num += 1
    } while (num <= 10)
  }
}
