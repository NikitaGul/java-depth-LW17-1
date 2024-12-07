package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void paralelTwoLines(){
        assertFalse(Main.paralel(0, 1, 1, 2, 0, 1, 1, 2));
    }

    @Test
    void crossLines(){
        assertTrue(Main.paralel(0, 3, 1, 0, 0, 4, 1, 5));
    }

    @Test
    void isThisPoint(){
        assertTrue(Main.isThis(1, 4, 1, 5, 2, 3));
    }

    @Test
    void xInMeasure(){
        assertTrue(Main.isThis(5, 7, 1, 4, 5, 3));
    }

    @Test
    void HasNotIs(){
        assertFalse(Main.isThis(5, 7, 3, 5, 3, 4));
    }

}