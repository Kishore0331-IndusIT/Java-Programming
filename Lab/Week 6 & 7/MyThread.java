import java.util.Scanner;
class MyThread extends Thread
{
	
	private SharedResource resource;
    private int numIncrements;

    // Constructor to initialize shared resource and number of increments
    public MyThread(SharedResource resource, int numIncrements)
	{
        this.resource = resource;
        this.numIncrements = numIncrements;
    }

    @Override
    public void run()
	{
        // Perform the specified number of increments
        for (int i = 0; i < numIncrements; i++)
		{
            resource.increment();
        }
}
	// Driver code is given for your reference
	
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        int numThreads = 0;
        int numIncrements = 0;
        boolean validInput = false;

        while (!validInput)
		{
            try
			{
                System.out.println("Enter the number of threads:");
                numThreads = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the number of increments per thread:");
                numIncrements = Integer.parseInt(scanner.nextLine());

                if (numThreads >= 1 && numIncrements >= 1)
				{
                    validInput = true;
                } 
				else
				{
                    System.out.println("Please enter valid numbers (1 or more) for threads and increments.");
                }
            } 
			catch (NumberFormatException e)
			{
                System.out.println("Please enter valid numbers.");
            }
        }

        SharedResource resource = new SharedResource();

        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++)
		{
            threads[i] = new MyThread(resource, numIncrements);
            threads[i].start();
        }

        scanner.close();
    }
}

class SharedResource
{
    private int count = 0;

    public void increment()
	{
        synchronized (this)
		{
            count++;
            System.out.println("Count: " + count);
        }
    }
}
