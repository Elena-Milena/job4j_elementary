package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {

    @Test
    public void whenDistance5() {
    int in = 7;
    int in2 = 3;
    int in3 = 2;
    int in4 = 6;
    double expected = 5.830951894845301;
    double out = Point.distance(in, in2, in3, in4);
        Assert.assertEquals(out, expected, 0.01);
    }
}