package day07MatchCase

object Test02MatchType {
  def main(args: Array[String]): Unit = {
    def descConst(x: Any): String = x match {
      case 1 => "num one"
      case "hello" => "String hello"
      case true => "true"
      case '+' => "plus"
    }
    println(descConst("hello"))
    println(descConst(1))
    println(descConst(true))

    def descType(x: Any): String = x match {
      case i: Int => s"int $i"
      case s: String => s"string $s"
      case list: List[String] => "list " + list
      case array: Array[Int] => "Array[int] " + array.mkString
      case _ => ""
    }
    println(descType(2))
    println(descType("21"))
    println(descType(List("a")))
    println(descType(List(2)))
    println(descType(Array(2)))
    println(descType(Array("2")))

    for (arr <- List(Array(0), Array(1, 2, 3), Array("a", "b", 4))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => s"x:$x y:$y"
        case Array(1, _*) => "array "
        case _ => "else"
      }
      println(result)

    }
  }
}
