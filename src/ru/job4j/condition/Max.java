package ru.job4j.condition;

import java.util.regex.Matcher;

public class Max {
    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }
    public static void main (String [] args) {
        int ddd = Max.max(4, 9);
        System.out.println(ddd);
    }
}
