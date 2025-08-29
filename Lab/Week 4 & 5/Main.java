import primepackage.PrimeGenerator;
import java.util.*;
public class Main
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for the number of primes to generate
        System.out.print("Enter the number of prime numbers to generate: ");
        int n = scanner.nextInt();

        // Generate the first 'n' primes using the generatePrimes method
        int[] primes = PrimeGenerator.generatePrimes(n);

        // Printing the generated prime numbers
        System.out.println("First " + n + " prime numbers are:");
        for (int prime : primes)
		{
            System.out.print(prime + " ");
        }

        scanner.close();
    }
}