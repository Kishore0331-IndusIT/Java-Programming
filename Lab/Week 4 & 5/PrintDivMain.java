public class PrintDivMain
{
	public static void main(String[] args)
	{
		try
		{
		//two command-line arguments converted into integer values
		//write your code here
		// Check if the command-line arguments are valid
            if (args.length < 2)
			{
                System.out.println("Insufficient inputs");
                return; // Exit if there are not enough arguments
			}
		// Convert the command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
			try
			{
			//perform divison operation and catch exception
			//write your code here
			 // Perform the division operation
                if (denominator == 0)
				{
                    throw new ArithmeticException(); // Throw an exception if dividing by zero
				}
                // Perform the division and print the result
                int result = numerator / denominator;
                System.out.println("Division: " + result);
				
			}
			catch(ArithmeticException e)
			{
			//write your code here
			// Handle division by zero
                System.out.println("Cannot divide with zero");
		    }
	}
	catch(NumberFormatException e)
	{
		//write your code here
		// Handle invalid input (non-integer type)
            System.out.println("Input is not of integer type");
		
	}
	catch(Exception e)
	{
		//write your code here
		// Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred");
	}
	}
}