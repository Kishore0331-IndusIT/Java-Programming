import java.util.Scanner;

public final class ImmutablePoint
{
    
    // Final instance variables to represent the coordinates of the point
    private final double x;
    private final double y;
    // Constructor to initialize the coordinates
   public ImmutablePoint(double x, double y)
   {
        this.x = x;
        this.y = y;
    }

    // Getter methods to retrieve the coordinates
   public double getX()
   {
        return x;
    }
	    public double getY()
		{
        return y;
    }
    // Method to calculate the distance between two points
    
    public double calculateDistance(ImmutablePoint other)
	{
        double dx = other.getX() - this.x;
        double dy = other.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy); // Euclidean distance formula
    }
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Input coordinates for the first point
        System.out.print("x-coordinate for first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("y-coordinate for first point: ");
        double y1 = scanner.nextDouble();
        ImmutablePoint point1 = new ImmutablePoint(x1, y1);

        // Input coordinates for the second point
        System.out.print("x-coordinate for second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("y-coordinate for second point: ");
        double y2 = scanner.nextDouble();
        ImmutablePoint point2 = new ImmutablePoint(x2, y2);

        // Close the scanner
        scanner.close();

        // Calculate and display the distance between the two points
        double distance = point1.calculateDistance(point2);
        System.out.println("-------------------");
		System.out.println("Distance: " + distance);
    }
}