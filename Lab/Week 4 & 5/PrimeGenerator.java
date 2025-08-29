package primepackage;
public class PrimeGenerator
{
    // Static method to generate the first 'n' prime numbers
    public static int[] generatePrimes(int n)
	{
        // An array to store the first 'n' prime numbers
        int[] primes = new int[n];
        int count = 0; // To count the number of primes found
        int number = 2; // Starting point (first prime number)

        while (count < n)
		{
            if (isPrime(number))
			{
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num)
	{
        if (num <= 1)
		{
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
		{
            if (num % i == 0)
			{
                return false; // Divisible by i, hence not prime
            }
        }
        return true; // Prime number
    }
    
}