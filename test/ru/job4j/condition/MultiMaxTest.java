package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void thrnMaxOne() {
        int result = MultiMax.max(9, 5, 3);
        assertThat(result, is(9));
    }
    @Test
    public void thenMaxTwo() {
        int result = MultiMax.max(6, 8, 1);
        assertThat(result, is(8));
    }
    @Test
    public void whenMaxTree() {
        int result = MultiMax.max(1, 2, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenNumbersEqual() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}