package com.edu.chmnu.ki_123.c3_individ_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testNoRoots() {
        double a = 2.0, b = 10.0, eps = 1e-6, h = 0.000005;

        assertThrows(Exception.class, () -> {
            Main.newtonSolve(a, b, eps, h);
        });
    }

    @Test
    public void testCheckExtremum() {
        assertTrue(Main.checkExtremum(1, 2, 1));
    }

    @Test
    public void testCheckFalseExtremum() {
        assertFalse(Main.checkExtremum(1, 2, 3));
    }
}