package ru.job4j.array.ru.job4j.array;

import junit.framework.TestCase;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class EqLastTest extends TestCase {

    public void testWhenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(EqLast.check(left, right), is(true));
    }
    public void testWhenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(EqLast.check(left, right), is(false));
    }
}