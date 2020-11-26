package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistance1329then728() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 2;
        int y2 = 9;
        double expected = 7.28;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance2568then5() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 6;
        int y2 = 8;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance7989then1() {
        int x1 = 7;
        int y1 = 9;
        int x2 = 8;
        int y2 = 9;
        double expected = 1.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}