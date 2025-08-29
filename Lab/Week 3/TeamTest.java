import java.util.Scanner;

class TeamMember
{
	// write your code here
	public void performTask()
	{
        System.out.println("Performing a task as a team member");
    }
	

}
class Developer extends TeamMember
{
	// write your code here 
	 @Override
    public void performTask()
	{
        Scanner scanner = new Scanner(System.in);

        // Prompt for the programming language
        System.out.print("Enter the programming language: ");
        String programmingLanguage = scanner.nextLine();

        // Output message indicating the developer and their programming language
        System.out.println("I am a developer coding in " + programmingLanguage);
    }
	
	
}	
class ProductOwner extends TeamMember
{
	// write your code here 
	@Override
    public void performTask()
	{
        Scanner scanner = new Scanner(System.in);

        // Prompt for the project being managed
        System.out.print("Enter the project: ");
        String project = scanner.nextLine();

        // Output message indicating the product owner and their project
        System.out.println("I am a product owner managing the " + project);
    }
	
	
}	
public class TeamTest
{
    public static void main(String[] args)
	{
        // Creating an instance of Developer
        Developer developer = new Developer();
        developer.performTask();

        // Creating an instance of ProductOwner
        ProductOwner productOwner = new ProductOwner();
        productOwner.performTask();
    }
}