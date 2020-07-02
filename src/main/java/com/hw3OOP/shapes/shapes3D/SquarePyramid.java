package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double baseWidth, pyramidHeight;

    public SquarePyramid(Vertex3D a, double baseWidth, double pyramidHeight) {
        super(Arrays.asList(a));
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        return (baseWidth * 2) + (1 / 2) * (baseWidth * 4) * pyramidHeight;
    }

    @Override
    public double getVolume() {

        return ((double) 1 / 3) * pyramidHeight * Math.pow(baseWidth, 2);
    }

    @Override
    public String toString() {
        return "Піраміда" + "\nВершини: " + super.toString() + "\nШирина основи = "
                + baseWidth + "\nВисота = " + pyramidHeight + "\nОб'єм = "
                + getVolume() + "\nПлоща = " + getArea();
    }
}
