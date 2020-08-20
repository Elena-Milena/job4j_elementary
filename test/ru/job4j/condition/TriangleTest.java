package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class TriangleTest {

    @Test
    public void whenExistTrue() {
    boolean result = Triangle.exist(15, 16, 17);
     assertThat(result, is(true));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenExistFalse() {
        boolean result = Triangle.exist(14, 13, 1);
        assertThat(result, is(false));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenExistFalse2() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(false));
    }
    }
