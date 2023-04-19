package com.alessio.exercises;

import java.awt.*;

public class Application {
    public static void drawShapes(Shape[] shapes) {
        for (Shape s : shapes){
            s.paint();
        }
    }

    public static void main(String[] args) {
        Shape c1 = new Circle("123", new Point(0,0), 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("456", new Point(0,0), 10);
        shapes[1] = new Rectangle("789", new Point(0,0), new Point(10,5));
        shapes[2] = new Circle("098", new Point(0, 10), 7);
        drawShapes(shapes);
    }
}
