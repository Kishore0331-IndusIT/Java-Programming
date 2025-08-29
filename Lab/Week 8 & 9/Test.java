import java.util.StringTokenizer;
import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string to tokenize: ");
         // Read the entire line
        String input = scanner.nextLine();
        // Create StringTokenizer object to split the string by space (" ")
        StringTokenizer tokenizer = new StringTokenizer(input);
        // Loop through the tokens and print each one
        System.out.println("Tokens in the string:");
        while (tokenizer.hasMoreTokens())
		{
            // Get the next token and print it
             System.out.println(tokenizer.nextToken());
        }
        scanner.close();
    }
}
