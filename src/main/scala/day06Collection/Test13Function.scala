package day06Collection

object Test13Function {
  def main(args: Array[String]): Unit = {
    val list = List(4, 2, 7, 3, 8, -2)

    var sum1 = 0
    for (elem <- list) {
      sum1 += elem
    }
    println(sum1)
    var sum2 = 0
    list.foreach(sum2+=_)
    println(sum2)

    println(list.sum)
    println(list.product)
    println(list.max)
    println(list.max)
    println(list.min)

    val sorted = list.sorted
    println(sorted)
    println(list.sorted(Ordering[Int].reverse))

    println(list.sortBy(a => a))
    println(list.sortWith((a, b) => {a < b}))
    println(list.sortWith(_<_))
    println(list.sortWith(_>_))


  }
}
