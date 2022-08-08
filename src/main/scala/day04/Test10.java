package day04;

public class Test10 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return fact(n - 1) * n;
    }
}
