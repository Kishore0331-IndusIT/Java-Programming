public class Calculator 
{
    // Static data members
    static int num1, num2,total;
	static double average;
    // Function to add the numbers and return the total
       public static int addNumbers() 
      {
    	 return num1 + num2;
      
       }
        // Function to calculate the average and return the average
          public static double calculateAverage() 
        {
           return (num1 + num2) / 2.0;
        }
        // Function to display results
       public static void displayResults() 
      {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
      }
    public static void main(String args[]) 
   {
        if (args.length != 2) 
        {
            System.out.println("please pass num1 and num2 as commandline arguments");
            return;
        }
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        total = addNumbers();
        average = calculateAverage();
        displayResults();  
    }
}
