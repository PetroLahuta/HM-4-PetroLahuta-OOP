package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex2D;

import java.util.Arrays;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(Vertex2D a, double radius) {
        super(Arrays.asList(a));
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг" + "\nВершина" + super.toString() + "\nПериметр  = "
                + getPerimeter() + "\nПлоща = " + getArea();
    }
}
