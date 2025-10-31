package com.nicoselomin.day_2;

public class RectangleCalculator {
    static void main(String[] args) {
        // Declare variables for length and width
        double length = 10.0;
        double width = 5.0;
        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);
        // Display the results
        System.out.println("Rectangle Calculator");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
