package day04

object Test12MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10

    //1.常规while循环
    while (n >= 1) {
      println(n)
      n -= 1
    }

    //2.函数实现while
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }

    n = 10
    myWhile(n >= 1) {
      println(n)
      n -= 1
    }

    //3.匿名函数实现while
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      op =>  {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
    }

    n = 10
    myWhile2(n >= 1) {
      println(n)
      n -= 1
    }

    //3.简写匿名函数实现while
    def myWhile3(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile(condition)(op)
      }
    }

    n = 10
    myWhile3(n >= 1) {
      println(n)
      n -= 1
    }

    //4.简写匿名函数实现while
    def myWhile4(condition: => Boolean, op: => Unit): Unit = {
      if (condition) {
        op
        myWhile(condition)(op)
      }
    }

    n = 10
    myWhile4(n >= 1, {
      println(n)
      n -= 1
    })
  }
}
