package ru.job4j.array.ru.job4j.array;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public class EndsWithTest extends TestCase {

    public void testWhenEndWithPrefixThenTrue() {
        char[] word = {'T', 'e', 's', 't'};
        char[] post = {'s', 't'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    public void testWhenEndWithPrefixThenFalse() {
        char[] word = {'T', 'e', 's', 't'};
        char[] post = {'o', 'y'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}