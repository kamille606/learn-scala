package day04

object Test05Lambda {
  def main(args: Array[String]): Unit = {
    val fun1 = (name: String) => {
      println(name)
    }
    def fun2(name: String): Unit = {
      println(name)
    }

    def f(func: String => Unit, name: String): Unit = {
      func(name)
    }
    f(fun1, "函数=匿名函数(lambda)")
    f(fun2, "函数")
    f((name: String) => {println(name)}, "匿名函数(lambda)")
  }
  val javaCode: String =
    """
      |public class TestService<T> {
      |    public static void main(String[] args) {
      |        Consumer<String> fun1 = (str) -> {
      |            System.out.println(str);
      |        };
      |        Consumer<String> fun2 = new Consumer<String>() {
      |            @Override
      |            public void accept(String s) {
      |                System.out.println(s);
      |            }
      |        };
      |        TestService<String> testService = new TestService<>();
      |        testService.f(fun1, "接口=匿名函数(lambda)");
      |        testService.f(fun2, "接口的匿名实现类");
      |        testService.f((s1 -> {
      |            System.out.println(s1);
      |        }), "匿名函数(lambda)");
      |    }
      |    public void f(Consumer<T> consumer, T v) {
      |        consumer.accept(v);
      |    }
      |}
      |""".stripMargin
}
