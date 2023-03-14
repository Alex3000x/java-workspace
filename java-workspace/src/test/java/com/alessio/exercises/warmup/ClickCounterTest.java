package com.alessio.exercises.warmup;

import com.alessio.exercises.oop.ClickCounter;
import org.junit.jupiter.api.Test;

class ClickCounterTest {
    @Test
    void getValue(){
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.click();
    }
}