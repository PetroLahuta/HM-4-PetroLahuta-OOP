package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex3D;

public class Sphere extends SpaceShape {
    Vertex3D vertex3D;
    double radius;

    public Sphere(int aX, int aY, int aZ, double radius) {
        this.vertex3D = new Vertex3D(aX, aY, aZ);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {

        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Сфера" + "\nВершина" + vertex3D + "\nОб'єм = " + getVolume()
                + "\nПлоща = " + getArea();
    }
}
