package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
     int result = first > second ? first : second;
     int rsl = result > third ? result : third;
     return rsl;
    }
    public static void main(String[] args) {
        int rsl1 = MultiMax.max(1, 2, 7);
        System.out.println(rsl1);
    }
}
