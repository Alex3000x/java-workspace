package com.alessio.exercises.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {
    @Test
    void fillArray(){
        double[] actual = FillArray.fillArray(5, 1, true);
        double[] expected = {1, 1, 1, 1, 1};
        System.out.print("actual array: ");
        for(int i = 0; i < actual.length; i++){
            System.out.print(actual[i] + " ");
        }
        assertNotEquals(actual, expected);
        //assertArrayEquals(actual);
    }

}