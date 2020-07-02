package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex3D;

import java.util.Arrays;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertex3D a, double radius) {
        super(Arrays.asList(a));
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
        return "Сфера" + "\nВершина" + super.toString() + "\nОб'єм = " + getVolume()
                + "\nПлоща = " + getArea();
    }
}
