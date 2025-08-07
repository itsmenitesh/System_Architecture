package SOLID.LiskovSubstitution;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class LSPExample2 {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(10, 20), new Square(5), new Circle(3)};
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.calculateArea());
        }
    }
}
