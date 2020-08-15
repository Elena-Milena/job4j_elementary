package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 1, b = 1, c = 1, d = 0;

        int expected = 1;

        int result = X2.calc(a, b, c, d);
        assertThat(result, is(expected));
    }

    @Test
    public void whenBCZero2() {
        int a = 1, b = 1, c = 1, d = 1;

        int expected = 1;

        int result = X2.calc(a, b, c, d);
        assertThat(result, is(expected));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenBCZero3() {
        int a = 0, b = 1, c = 1, d = 1;

        int expected = 1;

        int result = X2.calc(a, b, c, d);
        assertThat(result, is(expected));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenBCZero4() {
        int a = 1, b = 1, c = 0, d = 1;

        int expected = 1;

        int result = X2.calc(a, b, c, d);
        assertThat(result, is(expected));
    }
}