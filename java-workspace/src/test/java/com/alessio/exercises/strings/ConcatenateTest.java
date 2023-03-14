package com.alessio.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"He", "llo", " Worl", "d!"}));
    }
}