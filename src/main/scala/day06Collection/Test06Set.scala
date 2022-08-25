package day06Collection

object Test06Set {
  def main(args: Array[String]): Unit = {
    val set1 = Set(12, 32, 54, 32)
    println(set1)

    val set2 = set1.+(20)
    println(set2)

    val set3 = set1 + 20
    println(set3)

    val set4 = Set(11, 22, 33, 44)
    val set5 = Set(33, 44, 55, 66)
    val set6 = set4 ++ set5
    println(set6)
  }
}
