import java.util.Scanner;
	
public class TestOverloading2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter two integers for the first addition: ");
		 int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
         int intSum2 = sum(num1, num2); // Sum of two integers
		System.out.println("Sum of "+num1+" and "+num2+": "+intSum2);
		System.out.print("Enter three integers for  addition: ");
		  int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
		int intSum3 = sum(num3, num4, num5); // Sum of three integers
		System.out.println("Sum of "+num3+","+num4+" and "+num5+": "+intSum3);
        System.out.print("Enter two doubles for the second addition: ");
       double num6 = scanner.nextDouble();
        double num7 = scanner.nextDouble();
		double doubleSum2 = sum(num6, num7); // Sum of two doubles
		System.out.println("Sum of "+num6+" and "+num7+": "+doubleSum2);
		 System.out.print("Enter three doubles for the  addition: ");
		double num8 = scanner.nextDouble();
        double num9 = scanner.nextDouble();
        double num10 = scanner.nextDouble();
		double doubleSum3 = sum(num8, num9, num10); // Sum of three doubles
		System.out.println("Sum of "+num8+","+num9+" and "+num10+": "+doubleSum3);
        scanner.close();
    }
	 // Method to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to sum three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to sum two doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    // Method to sum three doubles
    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

}

   
  

       