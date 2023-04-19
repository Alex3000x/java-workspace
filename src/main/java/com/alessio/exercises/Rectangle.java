package com.alessio.exercises;

import java.awt.*;

public class Rectangle extends AbstractShape {
    String id;
    Point upperLeft;
    Point loweRight;

    public Rectangle(String id, Point upperLeft, Point lowerRight) {
        super(id);
        this.upperLeft = upperLeft;
        this.loweRight = lowerRight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id='" + id + '\'' +
                ", upperLeft=" + upperLeft +
                ", loweRight=" + loweRight +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public double getHeight() {
        return 2 * upperLeft.getX();
    }

    @Override
    public double getWidth() {
        return 2 * loweRight.getY();
    }

    @Override
    public void paint() { System.out.println("I'm a rectangle!");}
}
