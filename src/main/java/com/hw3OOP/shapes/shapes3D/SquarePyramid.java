package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    Vertex3D vertex3D;
    private double baseWidth, pyramidHeight;

    public SquarePyramid(int x, int y, int z, double baseWidth, double pyramidHeight) {
        this.vertex3D = new Vertex3D(x, y, z);
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
        return "Піраміда" + "\nВершини: " + vertex3D + "\nШирина основи = " + baseWidth + "\nВисота = "
                + pyramidHeight + "\nОб'єм = " + getVolume() + "\nПлоща = " + getArea();
    }
}
