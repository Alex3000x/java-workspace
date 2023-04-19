package com.alessio.exercises.oop.basic;

public class ClickCounter {
    int clicks;

    public ClickCounter() {
        this.clicks = 0;
    }

    public int getValue(){
        return clicks;
    }

    public void click(){
        clicks+= 1;
    }

    public void undo(){
        clicks -= 1;
        if (clicks <= 0){
            clicks = 0;
        }
        //clicks = Math.max(0, clicks - 1); Versione meno prolissa
    }

    public void reset(){
        clicks = 0;
    }

    @Override
    public String toString() {
        return "ClickCounter{" +
                "clicks=" + clicks +
                '}';
    }

    public static void main(String[] args) {
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.click();
        cc.undo();
        cc.reset();
    }
}
