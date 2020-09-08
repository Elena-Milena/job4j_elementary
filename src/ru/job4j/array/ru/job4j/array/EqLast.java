package ru.job4j.array.ru.job4j.array;

public class EqLast {
   public static boolean check(int[] left, int[] right) {
       for (int index = right.length - 1; index < right.length; index++) {
           if (right[index] == left[index]) {
               return true;
           }
       }
       return false;
   }
    }
