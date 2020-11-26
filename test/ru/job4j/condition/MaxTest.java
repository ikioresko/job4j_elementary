package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when5And1max5() {
        int a = 5;
        int b = 1;
        int expected = 5;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when8And15max15() {
        int a = 8;
        int b = 15;
        int expected = 15;
        int out = Max.max(a, b);
        Assert.assertEquals(expected, out);
    }
}