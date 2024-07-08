package com.gmail.dzhaparov.homework13_1;

public class Main {
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Triangle(4, 5),
                new Square(2)
        };

        System.out.println("Total area of all shapes: " + getTotalArea(shapes));
    }
}