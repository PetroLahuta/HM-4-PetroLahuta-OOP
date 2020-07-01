package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private Vertex2D a;
    private Vertex2D b;
    private Vertex2D c;

    private double ab;
    private double bc;
    private double ca;

    public Triangle(int aX, int aY, int bX, int bY, int cX, int cY) {
        this.a = new Vertex2D(aX, aY);
        this.b = new Vertex2D(bX, bY);
        this.c = new Vertex2D(cX, cY);

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
        return "Трикутник " + "\nВершина A: " + a + "\nВершина B: " + b
                + "\nВершина C: " + c + "\nПериметр = " + getPerimeter() + "\nПлоща = " + getArea();
    }
}
