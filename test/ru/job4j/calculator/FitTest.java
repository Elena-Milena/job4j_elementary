package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenWeightMan187Growth100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWeightWoman187Growth88() {
        short in2 = 187;
        double expected2 = 88.55;
        double out2 = Fit.womanWeight(in2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}