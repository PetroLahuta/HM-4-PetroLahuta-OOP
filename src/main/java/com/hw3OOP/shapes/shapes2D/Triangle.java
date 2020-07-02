package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {
    private double ab;
    private double bc;
    private double ca;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(Arrays.asList(a, b, c));
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;

        ab = distanceBetweenTwoVertices(a, b);
        bc = distanceBetweenTwoVertices(b, c);
        ca = distanceBetweenTwoVertices(c, a);
    }

    @Override
    public double getArea() {
        double p = 0.5 * (ab + bc + ca);
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    @Override
    public double getPerimeter() {
        double perimeter = ab + bc + ca;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Трикутник " + "\nВершина A: " + ab + "\nВершина B: " + bc
                + "\nВершина C: " + ca + "\nПериметр = " + getPerimeter() + "\nПлоща = " + getArea();
    }
}
