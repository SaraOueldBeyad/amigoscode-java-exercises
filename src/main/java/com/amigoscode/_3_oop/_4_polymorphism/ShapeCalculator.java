package com.amigoscode._3_oop._4_polymorphism;

import com.amigoscode._3_oop._3_abstractclasses.Circle;
import com.amigoscode._3_oop._3_abstractclasses.Rectangle;
import com.amigoscode._3_oop._3_abstractclasses.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Polymorphism - Shape Calculator
 *
 * Use polymorphism to write methods that work with any Shape.
 * Because Circle and Rectangle both extend Shape, a single method
 * can handle both — and any future Shape subclass — without modification.
 *
 * Key concepts:
 * - Methods that accept a supertype parameter
 * - Polymorphic collections (List<Shape>)
 * - instanceof with pattern matching (Java 16+)
 * - Open/closed principle in practice
 *
 * Prerequisites: Complete Shape.java, Circle.java, and Rectangle.java first.
 */
public class ShapeCalculator {

    // TODO: 1 - Create a method: void printShapeArea(Shape shape)
    //   Print: "The <className> has an area of <area>"
    //   Use shape.getClass().getSimpleName() to get the class name.
    //   Use String.format("%.2f", shape.area()) for formatting.

    public void printShapeArea(Shape shape){
        System.out.println(String.format("The %s has an area of %.2f", shape.getClass().getSimpleName(), shape.area()));
    }


    // TODO: 2 - Create a method: double totalArea(List<Shape> shapes)
    //   Iterate over all shapes and return the sum of their areas.

    public double totalArea(List<Shape> shapes){
        double sum = 0;
        for (Shape shape : shapes){
            sum += shape.area();
        }
        return sum;
    }


    // TODO: 3 - Create a method: Shape largestShape(List<Shape> shapes)
    //   Return the shape with the largest area.
    //   If the list is empty, return null.

    public Shape largestShape(List<Shape> shapes){
        if (shapes.size() == 0){
            return null;
        } else {
            Shape largestShape = shapes.getFirst();
            for (int i = 1; i < shapes.size(); i++) {
                if (largestShape.area() < shapes.get(i).area() ){
                    largestShape = shapes.get(i);
                }
            }
            return largestShape;
        }

    }


    // TODO: 4 - Create a method: String describeShape(Shape shape)
    //   Use instanceof with pattern matching (Java 16+) to return
    //   specific descriptions:
    //   - If shape is a Circle c: return "Circle with radius info"
    //     (just return "Circle detected with area: " + c.area())
    //   - If shape is a Rectangle r: return "Rectangle detected with area: " + r.area()
    //   - Otherwise: return "Unknown shape with area: " + shape.area()

    public String describeShape(Shape shape){
        if (shape instanceof Circle c){
            return String.format("Circle detected with area: %.2f", c.area());
        } else if (shape instanceof Rectangle r) {
            return String.format("Rectangle detected with area: %.2f", r.area());
        } else {
            return String.format("Unknown shape with area: %.2f", shape.area());
        }
    }

    // TODO: 5 - Create a method: String formatSummary(List<Shape> shapes)
    //   Return a formatted summary string like:
    //   "Summary: <N> shapes, total area: <totalArea>, largest area: <largestArea>"
    //   Use the totalArea() and largestShape() methods you already wrote.

    public String formatSummary(List<Shape> shapes){
        return String.format("Summary: %d shapes, total area: %.2f, largest area: %.2f" , shapes.size(), totalArea(shapes), largestShape(shapes).area());
    }


    // TODO: 6 - In main, create a List<Shape> with at least two Circles
    //   and two Rectangles. Call all the methods above and print results.
    //   This demonstrates polymorphism: the same method handles
    //   different shape types seamlessly.

    public static void main(String[] args) {
        // Complete TODO 6 here.

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle(5.0));
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Rectangle(4.0, 2.0));

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        try {
            for (Shape shape : shapes){
                shapeCalculator.printShapeArea(shape);
            }

            System.out.println(String.format("The total area is: %.2f", shapeCalculator.totalArea(shapes)));
            System.out.println("The largest shape is: \n" + shapeCalculator.describeShape(shapeCalculator.largestShape(shapes)));
            System.out.println(shapeCalculator.formatSummary(shapes));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
