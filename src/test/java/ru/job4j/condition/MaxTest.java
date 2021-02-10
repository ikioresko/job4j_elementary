package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void when5And1max5() {
        Max mt = new Max();
        Assert.assertEquals(5, mt.max(5, 1));
    }

    @Test
    public void when8And21And15max21() {
        Max mt = new Max();
        Assert.assertEquals(21, mt.max(8, 21, 15));
    }

    @Test
    public void when81And21And15And76max81() {
        Max mt = new Max();
        Assert.assertEquals(81, mt.max(81, 21, 15, 76));
    }
}