package day06Collection

object Test04List {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(list)
    println(list(1))
    list.foreach(println)

    val list2 = 10 +: list
    val list3 = list :+ 12
    val list4 = list.prepended(7)
    val list5 = list.appended(8)
    println(list2)
    println(list3)
    println(list4)
    println(list5)

    val list6 = Nil.::(23)
    println(list6)

    val list7 = 32 :: Nil
    println(list7)

    val list8 = 17 :: 26 :: 75 :: 11 :: Nil
    println(list8)

    val list9 = list7 :: list8
    println(list9)

    val list10 = list7 ::: list8
    println(list10)

    val list11 = list7 ++ list8
    println(list11)
  }
}
