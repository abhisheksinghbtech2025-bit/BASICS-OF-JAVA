/*
 * Assignment No: 7
 * Program 1: Shape Application using Inheritance and Interface
 *
 * Aim:
 * To demonstrate the concepts of Inheritance and Interfaces
 * using Circle and Rectangle classes.
 */

// Interface for calculating area
interface Area {

    // Abstract method
    void calculateArea();
}

// Parent Class
class Shape {

    // Data member
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Method to display shape color
    void displayColor() {
        System.out.println("Shape Color : " + color);
    }
}

// Child Class Circle
class Circle extends Shape implements Area {

    // Data member
    double radius;

    // Constructor
    Circle(String color, double radius) {

        // Calling parent constructor
        super(color);

        this.radius = radius;
    }

    // Implementing interface method
    @Override
    public void calculateArea() {

        double area = Math.PI * radius * radius;

        displayColor();

        System.out.println("Radius       : " + radius);
        System.out.printf("Area         : %.2f\n", area);
    }
}

// Child Class Rectangle
class Rectangle extends Shape implements Area {

    // Data members
    double length;
    double width;

    // Constructor
    Rectangle(String color, double length, double width) {

        // Calling parent constructor
        super(color);

        this.length = length;
        this.width = width;
    }

    // Implementing interface method
    @Override
    public void calculateArea() {

        double area = length * width;

        displayColor();

        System.out.println("Length       : " + length);
        System.out.println("Width        : " + width);
        System.out.println("Area         : " + area);
    }
}

// Main Class
public class ShapeDemo {

    public static void main(String[] args) {

        System.out.println("------ Circle ------");

        Circle c = new Circle("Red", 7);

        c.calculateArea();

        System.out.println("\n------ Rectangle ------");

        Rectangle r = new Rectangle("Blue", 10, 5);

        r.calculateArea();
    }
}