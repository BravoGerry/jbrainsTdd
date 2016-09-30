package com.tdd.lessons.one.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0,sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3,sum.intValue());
    }
}
