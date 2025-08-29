import java.util.Scanner;

class VotingEligibilityException extends Exception
{
	// Constructor to pass the error message to the base Exception class
    public VotingEligibilityException(String message)
	{
        super(message);
    }
}

public class VotingEligibility
{

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        try
		{
           // Prompt user to enter age
            System.out.print("Enter age: ");
            int age = scanner.nextInt(); // Read user input

            // Check if the age is in the valid voting range
            if (age < 18 || age > 60)
			{
                throw new VotingEligibilityException("Age must be between 18 and 60");
            }
			else
			{
                System.out.println("eligible to vote");
            } 
        }
		catch (VotingEligibilityException e)
		{
             // Handle custom exception (if age is outside valid range)
            System.out.println(e.getMessage());
        } 
		catch (Exception e)
		{
           // Handle invalid input (e.g., non-integer input)
            System.out.println("Invalid input");
        } 
		finally
		{
            // Close the scanner
            scanner.close();
        }
    }
}