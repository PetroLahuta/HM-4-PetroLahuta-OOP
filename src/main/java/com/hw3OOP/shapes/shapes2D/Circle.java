package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex;
import main.java.com.hw3OOP.vertex.Vertex2D;

public class Circle extends PlaneShape {

    private Vertex vertex;
    private double radius;

    public Circle(int aX, int aY, double radius) {
        this.vertex = new Vertex2D(aX, aY);
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
        return "Круг" + "\nВершина" + vertex + "\nПериметр  = "
                + getPerimeter() + "\nПлоща = " + getArea();
    }
}
