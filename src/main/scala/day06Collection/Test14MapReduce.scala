package day06Collection

object Test14MapReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8)

    val even = list.filter(_ % 2 == 0)
    println(even)

    //映射
    val map1 = list.map(_ * 2)
    val map2 = list.map(x => x * x)
    println(map1)
    println(map2)

    //扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)
    println(nestedList.flatten)

    val strings: List[String] = List("hello world", "hello scala", "hello java")
    val splitList: List[Array[String]] = strings.map(string => string.split(" "))
    val flattenList = splitList.flatten
    println(flattenList)
    val flattenMapList = strings.flatMap(string => string.split(" "))
    println(flattenMapList)

    //分组
    val groupMap = list.groupBy(x => {
      if (x % 2 == 0) "偶数" else "奇数"
    })
    val groupMap2 = list.groupBy(_ % 2)
    println(groupMap)
    println(groupMap2)

    //reduce
    println(list.reduce((a, b) => a + b))
    println(list.reduce(_ + _))
    println(list.sum)

    //fold
    var i = 0
    println(list.fold(10)((a, b) => a + b))
    println(i)
  }
}
