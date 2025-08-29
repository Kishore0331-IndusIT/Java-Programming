import java.util.Scanner;

interface Shape
{
    double calculateArea();      // Method to calculate area
    double calculatePerimeter(); // Method to calculate perimeter
}

interface Color
{
    String getColor();           // Method to get the color of the shape
}

class Triangle implements Shape, Color
{
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;

    // Constructor to initialize the sides of the triangle and its color
    public Triangle(double sideA, double sideB, double sideC, String color)
	{
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    // Implementing calculateArea method from Shape interface using Heron's formula
    @Override
    public double calculateArea()
	{
        double s = (sideA + sideB + sideC) / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Area calculation using Heron's formula
    }

    // Implementing calculatePerimeter method from Shape interface
    @Override
    public double calculatePerimeter()
	{
        return sideA + sideB + sideC; // Perimeter = sum of all sides
    }

    // Implementing getColor method from Color interface
    @Override
    public String getColor()
	{
        return color; // Return the color of the triangle
    }
    
}

public class HybridInheritance
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Input: sides of the triangle and its color
        System.out.print("Side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Side B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Side C: ");
        double sideC = scanner.nextDouble();
        
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Color: ");
        String color = scanner.nextLine();

        // Create Triangle object
        Triangle triangle = new Triangle(sideA, sideB, sideC, color);
        System.out.println("-------------------");
        // Output the area, perimeter, and color of the triangle
        System.out.printf("Area: %.2f\n", triangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", triangle.calculatePerimeter());
        System.out.println("Color: " + triangle.getColor());

        scanner.close();
    }
}