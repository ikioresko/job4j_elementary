package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Converter;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in2 = 180;
        int expected2 = 3;
        int out2 = Converter.rubleToDollar(in2);
        Assert.assertEquals(expected2, out2);
    }
}