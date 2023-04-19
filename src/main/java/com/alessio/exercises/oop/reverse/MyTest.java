package com.alessio.exercises.oop.reverse;

public class MyTest {
    public static void main(String[] args) {
        Reverser rev = new Reverser() {
            @Override
            public String reverse(String s) {
                return null;
            }
        };

        rev.reverse("Hello World!");
    }
}
