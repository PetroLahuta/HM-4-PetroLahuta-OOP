package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex2D;

public class Circle extends PlaneShape {

    Vertex2D vertex2D;
    double radius;

    public Circle(int aX, int aY, double radius) {
        this.vertex2D = new Vertex2D(aX, aY);
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
        return "Круг" + "\nВершина" + vertex2D + "\nПериметр  = "
                + getPerimeter() + "\nПлоща = " + getArea();
    }
}
