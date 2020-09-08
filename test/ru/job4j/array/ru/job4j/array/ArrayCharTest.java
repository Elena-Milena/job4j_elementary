package ru.job4j.array.ru.job4j.array;

import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class ArrayCharTest extends TestCase {
    @Test
    public void testWhenStartWithPrefixThenTrue() {
        char[] word = {'T', 'e', 's', 't'};
        char[] pref = {'T', 'e', 's', 't'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void testWhenNotStartWithPrefixThenFalse() {
        char[] word = {'T', 'e', 's', 't'};
        char[] pref = {'T', 'i', 'w', 'f'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    }
