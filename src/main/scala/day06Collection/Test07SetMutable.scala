package day06Collection

import scala.collection.mutable

object Test07SetMutable {
  def main(args: Array[String]): Unit = {
    val set1 = mutable.Set(1, 2, 3, 4)
    println(set1)

    set1.add(5)
    println(set1)
    set1.addOne(6)
    println(set1)
    set1.addAll(mutable.Set(7, 8, 9))
    println(set1)
    set1 += 10
    println(set1)

    set1 -= 1
    println(set1)
    set1.remove(2)
    println(set1)

    val set2 = set1 ++ set1
    println(set2)
  }
}
