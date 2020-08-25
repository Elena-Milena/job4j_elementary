package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest extends TestCase {
    @Test
    public void testSumByEven() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void testSumByEven2() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
    @Test
    public void testSumByEven3() {
        int rsl = Counter.sumByEven(1,1);
        int expected = 0;
        assertThat(rsl,is(expected));
    }
}