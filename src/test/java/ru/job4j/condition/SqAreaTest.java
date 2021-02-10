package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {
    @Test
    public void whenSquare25to4then25() {
        double p = 25;
        double k = 4;
        double expected = 25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquare10to2then555() {
        double p = 10;
        double k = 2;
        double expected = 5.55;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}