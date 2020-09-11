package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        start = data[0];
        finish = data.length-1;
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
            int index = (start + finish) / 2;
            if (data[index] == el) {
                rst = index;
            }
            if (data[index] < el) {
                rst = index + 1;
            }
            if (data[index] > el) {
                rst = index - 1;
            }
        return rst;
        }
    }


