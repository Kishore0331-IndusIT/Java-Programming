import java.util.Scanner;

// Base class Number
class Number
{
	double number;
	// Constructor to initialize the number
    public Number(double number)
	{
        this.number = number;
    }
}

// Derived class 1 - Square
class Square extends Number
{

    // Constructor to initialize the number for Square
    public Square(double number)
	{
        super(number);  // Call the base class constructor
    }

    // Method to calculate and return the square
    public double calculateSquare()
	{
        return number * number;
    }
}

// Derived class 2 - Cube
class Cube extends Number
{

    // Constructor to initialize the number for Cube
    public Cube(double number)
	{
        super(number);  // Call the base class constructor
    }

    // Method to calculate and return the cube
    public double calculateCube()
	{
        return number * number * number;
    }
}


// Main class
public class HierarchicalInheritance
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double inputNumber = scanner.nextDouble();
       // Create objects of derived classes
        Square squareObject = new Square(inputNumber);
        Cube cubeObject = new Cube(inputNumber);
        // Display the number, square, and cube
        System.out.println("Number: " + inputNumber);
        System.out.println("Square: " + squareObject.calculateSquare());
        System.out.println("Cube: " + cubeObject.calculateCube());

        scanner.close();

    }
}