package day06Collection

object Test12Derived {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 5, 7, 9, 2)
    val list2 = List(3, 5, 7, 9, 11)

    println(list1.head)
    println(list1.tail)
    println(list1)

    println(list2.last)
    println(list2.init)

    println(list1.reverse)
    println(list1.take(3))
    println(list1.takeRight(3))

    val union = list1.union(list2)
    val concat = list1.concat(list2)
    println(union)
    println(concat)

    val set1 = Set(1, 3, 5, 7, 9)
    val set2 = Set(3, 5, 7, 9, 11)
    println(set1.union(set2))
    println(set1 ++ set2)

    val intersection = list1.intersect(list2)
    println(intersection)

    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)

    //拉链
    println("zip" + list1.zip(list2))
    println("zip" + list2.zip(list1))

    //滑窗
    val slider = list1.sliding(3, 2)
    slider.foreach(println)
  }
}
