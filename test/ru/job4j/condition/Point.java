package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int y1, int x2, int y2) {
        int one = x2 - x1;
        int two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        double rsl = six;
        return rsl;
    }
    public static void main (String[] args) {
        double result = Point.distance(7, 3, 2, 6);
        System.out.println("result (7, 3) to (2, 6) + " + result);
    }
}
