package day04Function

object Test08PracticeCollectionOperation {
  def main(args: Array[String]): Unit = {
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (item <- array) yield op(item)
    }
    def addOne(item: Int): Int = {
      item + 1
    }
    val array = Array(12, 32, 53, 72)
    val newArray1 = arrayOperation(array, addOne)
    println(newArray1.mkString(","))

    val newArray2 = arrayOperation(array, a => {
      a + 1
    })
    val newArray3 = arrayOperation(array, _ + 1)
    println(newArray2.mkString(","))
    println(newArray3.mkString(","))
  }
}
