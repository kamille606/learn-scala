package day04Function;

import java.util.function.Consumer;

public class Test05<T> {
    public static void main(String[] args) {
        Consumer<String> fun1 = (str) -> {
            System.out.println(str);
        };
        Consumer<String> fun2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Test05<String> test = new Test05<>();
        test.f(fun1, "接口=匿名函数(lambda)");
        test.f(fun2, "接口的匿名实现类");
        test.f((s1 -> {
            System.out.println(s1);
        }), "匿名函数(lambda)");
    }
    public void f(Consumer<T> consumer, T v) {
        consumer.accept(v);
    }
}
