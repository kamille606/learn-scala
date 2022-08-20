package day05Class

object Test13TraitMixin {
  def main(args: Array[String]): Unit = {
    val student1 = new Student13
    student1.study()
    student1.increase()
    student1.play()
    student1.increase()
    student1.dating()
    student1.increase()

    val studentWithTalent = new Student13 with Talent {
      override def singing(): Unit = {
        println(s"$name 唱歌")
      }
      override def dancing(): Unit = {
        println(s"$name 跳舞")
      }
    }
    studentWithTalent.singing()
    studentWithTalent.dancing()

  }
}

trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}

class Student13 extends Person12 with Young with Knowledge {
  age = 12
  override val name: String = "student"
  def dating(): Unit = {
    println(s"student $name dating")
  }
  def study(): Unit = {
    println(s"student $name study")
  }
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"student $name $age hello")
  }
  override def increase(): Unit = {
    amount +=1
    println(s"student $name increased: $amount")
  }
}