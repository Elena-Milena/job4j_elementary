package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest extends TestCase {
    @Test
public void testWhen5() {
        boolean rsi = CheckPrimeNumber.chek(5);
        assertThat(rsi, is(true));
    }
    @Test
    public void testWhen0() {
        boolean rsl = CheckPrimeNumber.chek(0);
        assertThat(rsl, is(false));
    }
    @Test
    public void testWhen8() {
        boolean rsl = CheckPrimeNumber.chek(3);
        assertThat(rsl, is(true));
    }

}