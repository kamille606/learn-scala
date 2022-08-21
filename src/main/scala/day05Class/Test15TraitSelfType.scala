package day05Class

object Test15TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("lain", "123")
    user.insert()

    val user2 = new User("lain", "123")
    user2.insert()

    val bool = user.isInstanceOf[User]
    println(bool)
  }
}

trait UserDao {
  this: User =>
  def insert(): Unit = {
    println(s"插入成功 ${this.name} ${this.password}")
  }
}

class User(val name: String, val password: String) extends UserDao
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao