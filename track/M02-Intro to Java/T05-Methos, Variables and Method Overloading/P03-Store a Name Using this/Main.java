
import java.util.Scanner;

// Define the Student class
class Student {

    // Instance variable to hold the student's name
    String name;

    // Setter method to assign the name using 'this' to distinguish parameter from instance variable
    void setName(String name) {
        this.name = name;
    }

    // Method to display the student's stored name
    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner to read input from console
        Scanner scanner = new Scanner(System.in);

        // Read the student's name without printing prompts
        String name = scanner.nextLine();

        // Create an instance of the Student class
        Student student = new Student();

        // Set the name using the setName method
        student.setName(name);

        // Display the name using the displayName method
        student.displayName();

        // Close the scanner resource
        scanner.close();
    }
}
