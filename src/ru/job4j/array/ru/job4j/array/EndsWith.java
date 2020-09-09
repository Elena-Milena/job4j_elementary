package ru.job4j.array.ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = word.length; index >= 0; index--) {
            if (post[post.length-1] != word[word.length-1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
