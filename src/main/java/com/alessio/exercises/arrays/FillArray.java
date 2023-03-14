package com.alessio.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, int value, boolean randomize){
        double[] array = new double[size];
        if (randomize == true){
            RandomGenerator rnd = RandomGenerator.getDefault();
            for(int i = 0; i < size; i++){
                array[i] = rnd.nextDouble(value - 0.5, value + 0.5);
            }
        }
        else {
            Arrays.fill(array, value);
        }
        return array;
    }
}
