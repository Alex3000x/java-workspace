package com.alessio.exercises;

import java.awt.*;

public class Circle extends AbstractShape {
    Point center;
    double radius;

    public Circle(String id, Point center, double radius) {
        super(id);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public double getHeight() {
        return 2 * radius;
    }

    @Override
    public double getWidth() {
        return 2 * radius;
    }

    @Override
    public void paint() { System.out.println("I'm a circle!");}
}
