package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    private double width, height, depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        super(Arrays.asList(a));
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
        return "Кубоїд" + "\nВершини: " + super.toString() + "\nширина = " + width + "\nВисота = "
                + height + "\nГлибина = " + depth + "\nОб'єм = " + getVolume()
                + "\nПлоща = " + getArea();
    }
}
