package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0, num = array.length-1; index < num; index++, num--) {
            int temp = array[index];
            array[index] = array[num];
            array[num] = temp;
            }
        return array;
    }
}

