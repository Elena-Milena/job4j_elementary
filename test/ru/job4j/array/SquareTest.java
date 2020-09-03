package ru.job4j.array;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SquareTest extends TestCase {
    @Test
    public void testWhenBoundThen014() {
    int bound = 3;
    int[] rst = Square.calculate(bound);
    int[] expect = new int[] {0, 1, 4};
    assertThat(rst, is(expect));
    }
}