package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in2 = 256;
        int expected2 = 4;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("256 rubles are 2. Test result : " + passed2);
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(256);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("256 rubles are " + dollar + " dollar");
    }
}

