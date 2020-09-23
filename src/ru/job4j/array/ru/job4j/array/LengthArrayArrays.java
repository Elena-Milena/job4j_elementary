package ru.job4j.array.ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
    int[][] num = {{10}, {9, 8}, {7, 6, 5}, {4, 3, 2, 1}};
    for (int index = 0; index < num.length; index++) {
        System.out.println("Размер вложенного массива равен: " + num[index].length);
    }
    }
}
