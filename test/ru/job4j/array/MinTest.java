package ru.job4j.array;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MinTest extends TestCase {

    public void testFindMinZero() {
        assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
    }
    public void testWhenLastMinTree() {
        assertThat(Min.findMin(new int[] {10, 5, 3}), is(3));
    }
    public void testWhenMiddleMin() {
        assertThat(Min.findMin(new int[] {10, 2, 5}), is(2));
    }
    }
