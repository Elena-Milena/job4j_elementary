package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public class PrimeNumberTest extends TestCase {
    @Test
    public void testCalcWhen5() {
    int count = PrimeNumber.calc(5);
    assertThat(count, is(3));
    }
    @Test
    public void testWhen11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void testWhen2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}
