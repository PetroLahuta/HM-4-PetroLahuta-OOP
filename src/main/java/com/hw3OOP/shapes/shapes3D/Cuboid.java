package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex;
import main.java.com.hw3OOP.vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private Vertex vertex;
    private double width, height, depth;

    public Cuboid(int aX, int aY, int aZ, double width, double height, double depth) {
        this.vertex = new Vertex3D(aX, aY, aZ);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {

        return 2 * (width * height) + 2 * (height * depth) + 2 * (width * depth);
    }

    @Override
    public double getVolume() {

        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Кубоїд" + "\nВершини: " + vertex + "\nширина = " + width + "\nВисота = " + height
                + "\nГлибина = " + depth + "\nОб'єм = " + getVolume() + "\nПлоща = " + getArea();
    }
}
