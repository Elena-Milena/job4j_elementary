package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a)*(p - b)*(p - c);
        double rsl = Math.sqrt(s);
        return rsl;
    }
    public static void main(String [] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
