package day04Function

object Test06LambdaSimplify {
  def main(args: Array[String]): Unit = {
    def f(func: String => Unit): Unit = {
      func("alice")
    }

    f((name) => {
      println(name)
    })
    f(name => {
      println(name)
    })
    f(x => {
      println(x)
    })
    f(x => println(x))
    f(println(_))
    f(println)

    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))
    println(dualFunctionOneAndTwo((a, b) => a - b))
    println(dualFunctionOneAndTwo(_ - _))
    println(dualFunctionOneAndTwo(_ + _))
  }
}
