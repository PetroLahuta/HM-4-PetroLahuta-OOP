package main.java.com.hw3OOP;

import main.java.com.hw3OOP.shapes.Shape;
import main.java.com.hw3OOP.shapes.shapes2D.Circle;
import main.java.com.hw3OOP.shapes.shapes2D.Rectangle;
import main.java.com.hw3OOP.shapes.shapes2D.Triangle;
import main.java.com.hw3OOP.shapes.shapes3D.Cuboid;
import main.java.com.hw3OOP.shapes.shapes3D.Sphere;
import main.java.com.hw3OOP.shapes.shapes3D.SquarePyramid;
import main.java.com.hw3OOP.vertex.Vertex2D;
import main.java.com.hw3OOP.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Vertex2D(2, 3), new Vertex2D(2, 40),
                new Vertex2D(20, 3));
        Rectangle rectangle = new Rectangle(new Vertex2D(2, 5), 20, 9);
        Circle circle = new Circle(new Vertex2D(2, 4), 4);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(8, 8, 8),
                20, 31);
        Cuboid cuboid = new Cuboid(new Vertex3D(4, 4, 4), 15, 10, 4);
        Sphere sphere = new Sphere(new Vertex3D(13, 13, 13), 4);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(squarePyramid);
        shapes.add(cuboid);
        shapes.add(sphere);

        for (Shape myShape : shapes) {
            System.out.println("_________");
            System.out.println(myShape.toString());
        }

    }
}
