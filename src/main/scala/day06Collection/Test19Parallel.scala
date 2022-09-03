package day06Collection

import scala.collection.parallel.CollectionConverters._

object Test19Parallel {
  def main(args: Array[String]): Unit = {
    val result1 = (1 to 100).map(x => {
      Thread.currentThread().getName
    })


    val result2 = (1 to 100).par.map(x => {
      Thread.currentThread().getName
    })

    println(result1)
    println(result2)
  }
}
