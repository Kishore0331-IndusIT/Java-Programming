import java.util.Scanner;

public class ArraySquaresPrinter {
    public static void main(String[] args) {

    	// write your code here..
    	

		     // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
		System.out.println("Enter the size of array");
        int N = sc.nextInt();

        // Initialize an array to store the elements
        int[] arr = new int[N];
        System.out.println("Enter array elements");
        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the squares of the array elements
		System.out.print("Squares of Array Elements are:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }

        // Close the scanner
        sc.close();
    }	
}
