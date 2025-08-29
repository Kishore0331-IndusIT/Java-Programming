import java.util.Scanner; // Import Scanner class for user input
// A class representing an Employee with name, department, and salary.
public class Employee
 {
    String name;
    String department;
    double salary;

    // Constructor to initialize Employee object
     Employee(String name, String department, double salary)
	 {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display the Employee details on separate lines
    void display()
	{
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + salary);
    }

    // Method to update the Employee's department
    void updateDepartment(String newDepartment)
	{
        this.department = newDepartment;
    }

    // Method to update the Employee's salary
    void updateSalary(double newSalary)
	{
        this.salary = newSalary;
    }
}

class EmployeeDetailsExample
 {
	// A method that accepts an Employee object and modifies its details
    public static void updateEmployeeDetails(Employee employee, String newDepartment, double newSalary) {
        // Modifying the Employee object's fields
        
        // Changing the department
        employee.updateDepartment(newDepartment);
        // Changing the salary
		employee.updateSalary(newSalary);
    }

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in); 
        System.out.print("name : ");
        String name = scanner.nextLine(); 
		System.out.print("department : ");
        String department = scanner.nextLine(); 
		System.out.print("salary : ");
        double salary = scanner.nextDouble(); 

        // Create an Employee object using user input
        Employee employee = new Employee(name, department, salary);

        // Display the initial details of the employee
        System.out.println("Before updateEmployeeDetails method call");
        employee.display();

        scanner.nextLine();
        System.out.print("new department: ");
        String newDepartment = scanner.nextLine();
		System.out.print("new salary: ");
        double newSalary = scanner.nextDouble(); 

        // Update the Employee details with new department and salary
        updateEmployeeDetails(employee, newDepartment, newSalary);

        // Display the details of the employee after modification
        System.out.println("After updateEmployeeDetails method call");
        employee.display();
		scanner.close();
    }
}


