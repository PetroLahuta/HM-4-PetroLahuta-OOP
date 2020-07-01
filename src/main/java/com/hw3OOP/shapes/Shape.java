package main.java.com.hw3OOP.shapes;

import main.java.com.hw3OOP.vertex.Vertex;
import main.java.com.hw3OOP.vertex.Vertex2D;
import main.java.com.hw3OOP.vertex.Vertex3D;

import java.util.List;

public abstract class Shape {
    public double distanceBetweenTwoVertices(Vertex2D a, Vertex2D b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
    }

    public double distanceBetweenVerticesThreeD(Vertex3D a, Vertex3D b) {
        return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2))
                + Math.pow((a.getZ() - b.getZ()), 2));
    }

    List<Vertex> allVertex;
}
