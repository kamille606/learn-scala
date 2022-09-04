package day08

object Test02Implicit {
  def main(args: Array[String]): Unit = {
    val new12 = new MyRichInt(12)
    println(new12.myMax(15))

    //implicit def convert(num: Int): MyRichInt = new MyRichInt(num)
    implicit class MyRichInt(val self: Int) {
      def myMax(n: Int): Int = if (n < self) self else n
      def myMin(n: Int): Int = if (n < self) n else self
    }
    println(12.myMax(15))
  }
}

