import java.util.Scanner;

class Calculation
{
    protected int num1, num2;

    // Constructor to initialize the two integers
    public Calculation(int num1, int num2)
	{
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to perform addition and return the result
    public int addition()
	{
        return num1 + num2;
    }
}
class My_Calculation extends Calculation
{

    // Constructor that calls the parent constructor
    public My_Calculation(int num1, int num2)
	{
        super(num1, num2);
    }

    // Method to perform multiplication and return the result
    public int multiplication()
	{
        return num1 * num2;
    }
}
public class MainCalculation
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Integer Numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        My_Calculation myCalculation = new My_Calculation(num1, num2);

        int sum = myCalculation.addition();
        int product = myCalculation.multiplication();

        System.out.println("Sum of "+num1+" & "+num2+":"+sum);
        System.out.println("Product of "+num1+" & "+num2+":"+product);

        scanner.close();
    }
}
