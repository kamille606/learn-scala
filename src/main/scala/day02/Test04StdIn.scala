package day02

import scala.io.StdIn

object Test04StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入：")
    val name = StdIn.readLine()
    println(s"输入为：${name}")
  }
}
