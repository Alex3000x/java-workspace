package com.alessio.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {

    @Test
    void reverse() {
        assertEquals( "!dlroW olleH", Reverse.reverse("Hello World!"));
    }
}