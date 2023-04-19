package com.alessio.exercises;

public abstract class AbstractShape implements Shape {
    String id;

    public AbstractShape(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }
}
