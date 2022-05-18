package day04

object Test09ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }
    def addBy4(b: Int): Int = {
      4 + b
    }
    def addBy5(b: Int): Int = {
      5 + b
    }

    def addByFour(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }
    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(32)(21))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }
    def addByA2(a: Int): Int => Int = {
      b =>a + b
    }
    def addByA3(a: Int)(b: Int): Int = {
      a + b
    }
    def addByA4(a: Int): Int => Int = {
      a + _
    }

  }
}
