package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex2D;

import java.util.Arrays;

public class Rectangle extends PlaneShape {
    private double width, height;

    public Rectangle(Vertex2D a, double width, double height) {
        super(Arrays.asList(a));
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return (width * height);
    }

    @Override
    public double getPerimeter() {

        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямокутник " + "\nВершина: " + super.toString()
                + "\nПериметр  = " + getPerimeter() + "\nПлоща = " + getArea();
    }
}
