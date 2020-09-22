package ru.job4j.array.ru.job4j.array;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import junit.framework.TestCase;

public class MatrixSumTest extends TestCase {

    public void testWhenSingle() {
        int[][] in = {
                {10}
        };
        int expected = 10;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expected));
    }

    public void testWhenTwo() {
        int[][] in = {
                {1, 2},
                {1, 1}
        };
        int expected = 5;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expected));
    }

    public void testWhenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expect = 7;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }
}
