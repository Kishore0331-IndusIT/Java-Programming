import java.util.Scanner;
class ObjectCounter {
    // Static variable to keep track of the number of objects
    
	private static int count = 0;
    
    public ObjectCounter() {
	// Constructor increments the object count when an object is created
	count++;
	System.out.println("Object is created:"+count);
    }
    public static int getObjectCount() {  // Static method to get the current count of objects
    	// return count
        return count;
    }
}
public class ObjectCountTest {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of objects to create
        System.out.print("Enter the number of objects to create: ");
        int numObjects = sc.nextInt();

        // Loop to create the specified number of objects
        for (int i = 0; i < numObjects; i++) {
            new ObjectCounter(); // Creating an object will increment the count
        }

        // Display the total count of objects created
        System.out.println("Total number of objects created: " + ObjectCounter.getObjectCount());

        // Close the scanner
        sc.close();
    }
        

            
}


