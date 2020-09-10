package ru.job4j.array.ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = post.length-1, value = word.length-1; index >= 0; index--, value--) {
            if (post[index] != word[value]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
