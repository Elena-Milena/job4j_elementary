package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert256RbThen4Dollar() {
        int in2 = 256;
        int expected2 = 4;
        int out2 = Converter.rubleToDollar(in2);
        Assert.assertEquals(out2, expected2);
    }
}