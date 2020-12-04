package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenDistance1329then728() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 9);
        double expected = 6.08;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance2568then5() {
        Point a = new Point(2, 5);
        Point b = new Point(6, 8);
        double expected = 5.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance7989then1() {
        Point a = new Point(7, 9);
        Point b = new Point(8, 9);
        double expected = 1.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}