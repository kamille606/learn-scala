package day02

import day01.Student

object Test06DataType {
  def main(args: Array[String]): Unit = {
    val a1: Byte = 127
    val a2: Byte = -128

    val a3 = 12
    val a4: Long = 123456789222L

    val b1: Byte = 10
    val b2: Byte = (10 + 20)

    //val b3: Byte = (b1 + 20)
    val b3: Byte = (b1 + 20).toByte

    val c1: Float = 3.14F
    val c2: Double = 3.14

    val s1: Char = 'a'
    val s2: Char = '7'
    val s3: Char = '\t'
    val s4: Char = '\n'
    val s5: Char = '\\'
    val s6: Char = '\"'
    val s7: Char = '\''
    val s8: Char = 100.toChar

    val isTrue: Boolean = true
    val isFalse = false

    def m1(): Unit = {
      println("调用m1")
    }
    val m2: Unit = ()
    val m3: Unit = m1()

    var student: Student = new Student("alice", 12)
    student = null
    println(student)

    def e1(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException()
      else
        return n
    }
    val e = e1(0)
    println(e)
  }
}
