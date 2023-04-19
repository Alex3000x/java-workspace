package com.alessio.exercises.generics;

public class Divide {

    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {
        int i1 = 6, i2 = 2, i3 = 5, i4 = 24;
        double d1 = 3, d2 = 6, d3 = 15, d4 = 8;
        System.out.println(divide(i1,i2));
        System.out.println(divide(i1,d1));
        System.out.println(divide(d3,i3));
        System.out.println(divide(d4,d1));
        System.out.println(divide(d3,d1));
        System.out.println(divide(i4,d4));
    }
}
