package ru.job4j.array;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class SwitchArrayTest extends TestCase {
    @Test
    public void testWhenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expected));
    }
    @Test
    public void testWhenSwap1to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 4, 3, 2};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }
}