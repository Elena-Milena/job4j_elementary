package ru.job4j.calculator;

public class X2 {
    public static int calc(int a, int b, int c, int d) {
        return a * d * d + b * d + c;
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")

    public static void main(String[] args) {
        int a = 1, b = 1, c = 1, d = 0;
        int result = X2.calc(a, b, c, d);
        System.out.println(result);
    }
}
