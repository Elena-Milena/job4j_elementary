package ru.job4j.loop;

public class Factorial {
    public static int calc (int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
            if (result == 0) {
            }
            result = result * x;
        }
        return result;
    }
}
