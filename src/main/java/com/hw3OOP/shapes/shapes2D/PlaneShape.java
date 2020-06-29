package main.java.com.hw3OOP.shapes.shapes2D;

import main.java.com.hw3OOP.shapes.Shape;
import main.java.com.hw3OOP.interfaces.AreaMeasurable;
import main.java.com.hw3OOP.interfaces.PerimeterMeasurable;
import main.java.com.hw3OOP.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    List<Vertex2D> listOfVertices2D;
}
