package com.alessio.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {
    @Test
    void CopyArray(){
        double[] src = new double[]{1, 2, 3, 4, 5};
        double[] dst = CopyArray.copyArray(src);
        assertArrayEquals(src, dst);
    }
}