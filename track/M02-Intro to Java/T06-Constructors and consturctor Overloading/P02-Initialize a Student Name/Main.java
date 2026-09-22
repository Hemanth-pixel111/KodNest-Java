
import java.util.Scanner;

class Student {

    // Instance variable to store the student's name
    String name;

    // Constructor to initialize the Student object with a name
    Student(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    // Method to display the student's details
    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        // Create Scanner object to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Read one full line containing the student's name
        String name = scanner.nextLine();

        // Create a Student object passing the input name to the constructor
        Student student = new Student(name);

        // Call the display method to print the output
        student.display();

        // Close the scanner resource
        scanner.close();
    }
}
