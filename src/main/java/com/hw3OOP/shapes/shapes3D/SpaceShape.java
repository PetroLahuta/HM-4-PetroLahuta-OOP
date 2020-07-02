package main.java.com.hw3OOP.shapes.shapes3D;

import main.java.com.hw3OOP.interfaces.AreaMeasurable;
import main.java.com.hw3OOP.interfaces.VolumeMeasurable;
import main.java.com.hw3OOP.shapes.Shape;
import main.java.com.hw3OOP.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List<Vertex> vertex3D) {
        super(vertex3D);
    }
}

