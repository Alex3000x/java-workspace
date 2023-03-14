package com.alessio.exercises.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {

    @Test
    void add() {
        RationalNumber r1 = new RationalNumber(1,1);
        RationalNumber r2 = new RationalNumber(1,1);
        assertEquals(new RationalNumber(2,1).denominator, r1.add(r2));
    }

    @Test
    void multiply() {
    }

    @Test
    void testEquals() {
    }
}