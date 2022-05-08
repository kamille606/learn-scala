package day02

object Test03String {
  def main(args: Array[String]): Unit = {
    val name: String = "alice"
    val age: Int = 18
    println(age + "岁的" + name)
    printf("%d岁的%s", age, name)
    println()
    println(s"${age}岁的${name}")
    val num: Double = 2.132
    println(f"${num}%2.2f")
    println(raw"${num}%2.2f")
    val sql =
      s"""
         |select
         |  *
         |from
         |  table
         |where
         |  name = ${name}
         |""".stripMargin
    println(sql)
  }
}
