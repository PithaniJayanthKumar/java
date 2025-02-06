package com.wipro.java.java8;


//functional interface must have one abstract method
//and can have multiple default and static methods
// Functional interface with one abstract method and two default and static methods
@FunctionalInterface
interface ShapeCalculator {
    // Abstract method to calculate the perimeter of a shape
    public void Perimeter(double d1, double d2);

    // Default method to display shape info
    default String displayShape(String shapeName) {
        return "This is a " + shapeName;
    }

    // Default method to calculate the perimeter of a square
    default String SquarePerimeter(double side) {
        return "Perimeter of the square: " + (4 * side) + " units";
    }

    // Static method to show a calculation message
    static String showMessage() {
        return "Shapes are fundamental geometric objects.";
    }

    // Static method to show general information about shapes
    static String showInfo() {
        return "Calculating perimeter for the shape...";
    }
}

// Implementing the Shape interface for Rhombus and Square
class Shapes implements ShapeCalculator{

    // Implementing the abstract method to calculate the perimeter of different shapes
    public void Perimeter(double d1, double d2) {
        // Rhombus: Perimeter = 4 * side
        double perimeter = 4 * d1;
        System.out.println("Perimeter of the Rhombus: " + perimeter);
        
        // Square: Perimeter = 4 * side
        perimeter = 4 * d1;
        System.out.println("Perimeter of the Square: " + perimeter);
    }

    // Driver method to test the shape calculations
    public static void main(String args[]) {
        Shapes size = new Shapes();
        

        // Calling static methods
        System.out.println(ShapeCalculator.showMessage());
        System.out.println(ShapeCalculator.showInfo());

        // Calculate perimeter for Rhombus and Square
        size.Perimeter(5, 0);  // Rhombus: Side = 5 units
        size.Perimeter(4, 0);  // Square: Side = 4 units

        // Calling default methods
        System.out.println(size.displayShape("Rhombus"));
        System.out.println(size.SquarePerimeter(4));  // Perimeter of square

    }
}
