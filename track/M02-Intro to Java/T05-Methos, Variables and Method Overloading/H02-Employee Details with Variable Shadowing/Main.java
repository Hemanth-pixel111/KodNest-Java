
import java.util.Scanner;

// Define the Employee class
class Employee {

    // Instance variables
    String name;
    double salary;

    // Method to initialize instance variables using 'this' to resolve variable shadowing
    void setDetails(String name, double salary) {
        // 'this.name' refers to the instance variable, while 'name' refers to the parameter
        this.name = name;
        // 'this.salary' refers to the instance variable, while 'salary' refers to the parameter
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner for reading standard input
        Scanner scanner = new Scanner(System.in);

        // Read the employee's full name without prompts
        String name = scanner.nextLine();

        // Read the salary value
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee();

        // Set the employee's details
        employee.setDetails(name, salary);

        // Display the details in the required format
        employee.displayDetails();

        // Close the scanner resource
        scanner.close();
    }
}
