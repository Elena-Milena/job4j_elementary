package ru.job4j.array;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest extends TestCase {
    @Test
    public void testwhenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void testwhenArrayHas7Then0() {
        int input[] = {6, 5, 8, 3, 2, 1};
        int value = 9;
        int result = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }
    @Test
    public void testWhenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void testWhenNoFind() {
        int[] input = new int[] {7, 1, 66, 93, 2};
        int value = 67;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
}