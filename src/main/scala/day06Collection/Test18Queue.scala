package day06Collection

import scala.collection.{immutable, mutable}

object Test18Queue {
  def main(args: Array[String]): Unit = {
    val queue = mutable.Queue[String]()
    queue.enqueue("a", "b", "c")
    println(queue)

    println(queue.dequeue)
    println(queue)
    queue.enqueue("d")
    println(queue)
    println(queue.dequeue)
    println(queue)

    val queue2 = immutable.Queue[String]("a", "b", "c")
    val queue3 = queue2.dequeue
    println(queue2)
    println(queue3._2)
  }
}
