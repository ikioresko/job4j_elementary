package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {
    @Test
    public void whenManWeight175Then8625() {
        short height = 175;
        double expected = 86.25;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeightThen5749() {
        short height = 160;
        double expected = 57.49;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}