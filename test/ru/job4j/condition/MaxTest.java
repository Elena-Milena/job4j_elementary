package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void thenMax9() {
        int result = Max.max(4, 9);
        assertThat(result, is(9));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void thenMax7() {
        int result = Max.max(7, 1);
        assertThat(result, is(7));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void thenMax4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}