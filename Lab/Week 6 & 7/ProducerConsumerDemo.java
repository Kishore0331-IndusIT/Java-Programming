import java.util.LinkedList;
import java.util.Scanner;

// Write your code here...
class SharedBuffer
{
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    // Constructor to set the buffer capacity
    public SharedBuffer(int capacity)
	{
        this.capacity = capacity;
    }

    // Produce an item and add it to the buffer
    public synchronized void produce(int item) throws InterruptedException
	{
        while (buffer.size() == capacity) 
		{
            wait(); // Wait if the buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify(); // Notify the consumer that an item is available
    }

    // Consume an item from the buffer
    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty())
		{
            wait(); // Wait if the buffer is empty
        }
        int item = buffer.removeFirst();
        System.out.println("Consumed: " + item);
        notify(); // Notify the producer that space is available
    }
}

class Producer extends Thread
{
    private SharedBuffer buffer;
    private int itemsToProduce;

    public Producer(SharedBuffer buffer, int itemsToProduce)
	{
        this.buffer = buffer;
        this.itemsToProduce = itemsToProduce;
    }

    @Override
    public void run()
	{
        try
		{
            for (int i = 1; i <= itemsToProduce; i++)
			{
                buffer.produce(i);
                Thread.sleep(100); // Simulating some delay in producing
            }
        } 
		catch (InterruptedException e)
		{
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread
{
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer)
	{
        this.buffer = buffer;
    }

    @Override
    public void run()
	{
        try
		{
            // Continue consuming until the producer has finished producing
            while (true)
			{
                buffer.consume();
                Thread.sleep(100); // Simulating some delay in consuming
            }
        } 
		catch (InterruptedException e)
		{
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerDemo
{
	
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of items to produce
        System.out.print("Enter the number of items to produce: ");
        int itemsToProduce = scanner.nextInt();

        // Create a shared buffer
        SharedBuffer buffer = new SharedBuffer(itemsToProduce);

        // Create producer and consumer threads
        Producer producer = new Producer(buffer, itemsToProduce);
        Consumer consumer = new Consumer(buffer);

        // Start the threads
        producer.start();
        consumer.start();

        // Wait for producer to finish producing before terminating the consumer
        try
		{
            producer.join();  // Wait for producer to finish
        } 
		catch (InterruptedException e)
		{
            Thread.currentThread().interrupt();
        }

        // Interrupt the consumer to gracefully stop the thread after production
        consumer.interrupt();

        // Close the scanner
        scanner.close();
    }
}