package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest extends TestCase {
    @Test
    public void testWhenYear2() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
    @Test
    public void testWhenYear1() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }
}