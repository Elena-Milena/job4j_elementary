package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= finish; start++) {
            for (int index = start; index <= start; index++) {
                sum = sum + start;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(2, 8));
        System.out.println(sum(1, 1));
    }
}
