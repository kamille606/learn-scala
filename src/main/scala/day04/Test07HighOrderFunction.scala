package day04

object Test07HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      n + 1
    }

    def fun(): Int = {
      1
    }

    val result = f(123)
    //传递函数
    val f1 = f _
    val f2: Int => Int = f

    //调用函数
    val f3 = fun
    //传递函数
    val f4 = fun _
    val f5: () => Int = fun

    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 23))
    println(dualEval((a, b) => a + b, 12, 23))
    println(dualEval(_ + _, 12, 23))

    //函数作为返回值
    def func1(): Int => Unit = {
      def func2(a: Int): Unit = {
        println(s"func调用$a")
      }
      func2
    }
    def func3() = {
      def func4(a: Int): Unit = {
        println(s"func调用$a")
      }
      func4 _
    }

    def func5(): Int => Unit = (a) => {
      println(s"func调用$a")
    }
    def func6(a: String): String => Unit = (b) => {
      println(s"func调用a:$a,b:$b")
    }
    println(func1())
    println(func3())
    println(func3()(33))
    val intToUnit = func5()
    println(intToUnit(5))
    println(func5()(55))

    val stringToUnit = func6("a")
    println(stringToUnit("b"))
    println(func6("a")("b"))
  }
}
