package main.java.com.hw3OOP;

import main.java.com.hw3OOP.shapes.Shape;
import main.java.com.hw3OOP.shapes.shapes2D.Circle;
import main.java.com.hw3OOP.shapes.shapes2D.Rectangle;
import main.java.com.hw3OOP.shapes.shapes2D.Triangle;
import main.java.com.hw3OOP.shapes.shapes3D.Cuboid;
import main.java.com.hw3OOP.shapes.shapes3D.Sphere;
import main.java.com.hw3OOP.shapes.shapes3D.SquarePyramid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 3, 2, 40, 20, 3);
        Rectangle rectangle = new Rectangle(2, 5, 20, 9);
        Circle circle = new Circle(2, 4, 4);
        SquarePyramid squarePyramid = new SquarePyramid(8, 8, 8, 20, 31);
        Cuboid cuboid = new Cuboid(4, 4, 4, 15, 10, 4);
        Sphere sphere = new Sphere(13, 13, 13, 4);

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
