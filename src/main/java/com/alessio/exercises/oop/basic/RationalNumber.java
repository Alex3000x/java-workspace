package com.alessio.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    int denominator;
    int numerator;

    public RationalNumber(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    private int mcd(int a, int b){
        int temp;
        while(b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public RationalNumber add(RationalNumber o){
        int den = (denominator * o.denominator) / this.mcd(denominator, o.denominator) ;
        int num = (numerator / den) + (o.numerator / den);
        return new RationalNumber(den, num);
    }

    public RationalNumber multiply(RationalNumber o){
        int den = denominator * o.denominator;
        int num = numerator * o.numerator;
        return new RationalNumber(den, num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return denominator == that.denominator && numerator == that.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator, numerator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "denominator=" + denominator +
                ", numerator=" + numerator +
                '}';
    }
}
