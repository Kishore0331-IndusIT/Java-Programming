import java.util.Scanner;

class TablePrinter implements Runnable
{
    private int tableNumber;

    public TablePrinter(int tableNumber)
	{
        this.tableNumber = tableNumber;
    }

    // Implement the run method to generate the multiplication table
    @Override
    public void run()
	{
        try
		{
            // Generate multiplication table for the assigned tableNumber
            for (int i = 1; i <= 10; i++) {
                System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
                // Adding a small delay (100ms) for better visualization
                Thread.sleep(100);
            }
        } 
		catch (InterruptedException e)
		{
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
    }
   
}

public class Main
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tables:");
        int numTables = scanner.nextInt();
        Thread[] threads = new Thread[numTables];
            
		 // Create and start threads for each table
        for (int i = 1; i <= numTables; i++)
		{
            // Create a TablePrinter for each table (1 to numTables)
            TablePrinter tablePrinter = new TablePrinter(i);
            // Create a new thread for each TablePrinter instance
            threads[i - 1] = new Thread(tablePrinter);
            threads[i - 1].start(); // Start the thread
        }

        // Wait for all threads to finish using join()
        try
		{
            for (Thread thread : threads)
			{
                thread.join(); // Ensure the main thread waits for each worker thread to complete
            }
        } 
		catch (InterruptedException e)
		{
            System.err.println("Main thread was interrupted: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    
        
    }
}