package day07MatchCase

object Test01 {
  def main(args: Array[String]): Unit = {
    val x = 3
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    val a = 23
    val b = 12

    def matchDualOp(op: Char): Int = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => -1
    }
    println(matchDualOp('='))
    println(matchDualOp('+'))
    println(matchDualOp('-'))

    //模式守卫
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
  }
}
