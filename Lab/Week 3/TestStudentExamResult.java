import java.util.Scanner;
class Student
{
    protected int rollNumber;
    protected String name;
    protected String branch;
    public Student(int rollNumber, String name, String branch)
	{
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
       
    }
    
    public void displayStudentDetails(
	{
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }
}

class Exam extends Student
{
   protected int[] subjectMarks;
    // Constructor to initialize student and subject marks
    public Exam(int rollNumber, String name, String branch, int[] subjectMarks)
	{
        super(rollNumber, name, branch);
        this.subjectMarks = subjectMarks;
   
    }
    
    public void displayExamDetails()
	{
        displayStudentDetails();
        System.out.println("Subject Marks:");
        for (int i = 0; i < subjectMarks.length; i++)
		{
            System.out.println("Subject " + (i+1) + ": " + subjectMarks[i]);
        }
    }
}

class Result extends Exam
{
    
    
    private int totalMarks;
    private String result;

    // Constructor to initialize student details, subject marks, and calculate the result
    public Result(int rollNumber, String name, String branch, int[] subjectMarks)
	{
        super(rollNumber, name, branch, subjectMarks);
        calculateResult();
	}
    // Method to calculate total marks and determine the result
    private void calculateResult()
	{
        totalMarks = 0;
        for (int marks : subjectMarks)
		{
            totalMarks += marks;
        }
        // Determine result based on total marks
        result = totalMarks >= 150 ? "Pass" : "Fail"; // Assuming 150 is the passing criteria
    
    
    }
    
    public void displayResult()
	{
        System.out.println("Result:");
		 System.out.println("--------------");
        displayExamDetails();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Result: " + result);
    }
}

public class TestStudentExamResult
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Branch: ");
        String branch = scanner.nextLine();
        int[] subjectMarks = new int[3];
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++)
		{
            System.out.print("Subject " + (i+1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }
        Result studentResult = new Result(rollNumber, name, branch, subjectMarks);
        studentResult.displayResult();
        
        scanner.close();
    }
}