package day02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test05FileIo {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("src/main/resources/test.txt")
    source.foreach(print)
    source.close()
    val writer =  new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java writer")
    writer.close()
  }
}
