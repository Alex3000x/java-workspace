package com.alessio.exercises;

import java.io.IOException;

public class OtherTest {
    public static void testChecked() {
        //throw new IOException();   //it will give an error because the Exception is checked
    }

    public static void testUnchecked() {
        throw new RuntimeException();
    }



    public static void main(String[] args) {
        testChecked();
    }
}
