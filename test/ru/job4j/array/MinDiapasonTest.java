package ru.job4j.array;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest extends TestCase {

    public void testFindMin() {
        assertThat(MinDiapason.findMin(new int[] {-1, 0, 5, 10}, 1, 3), is(0));
    }

    public void testWhenLastMin() {
        assertThat(MinDiapason.findMin(new int[] {10, 5, 3, 1}, 1, 3), is(1));
    }


     public void testWhenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[] {10, 2, 5, 1}, 0, 2), is(2));
    }
}