
import java.util.Scanner;

// Define the Student class
class Student {

    // Instance variable to store student's name
    String name;

    // Method to set name using 'this' keyword
    void setName(String name) {
        this.name = name;
    }

    // Method to display the stored name
    void showName() {
        System.out.println("Student Name: " + name);
    }

    // Overloaded method to print a single score
    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    // Overloaded method to calculate and print the total of two scores
    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner for reading standard input
        Scanner scanner = new Scanner(System.in);

        // Read the student's full name without prompts
        String name = scanner.nextLine();

        // Read two integer scores without prompts
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create an instance of the Student class
        Student student = new Student();

        // Store the name in the student object
        student.setName(name);

        // Print the stored name
        student.showName();

        // Call the single-parameter showScore method
        student.showScore(first);

        // Call the two-parameter overloaded showScore method
        student.showScore(first, second);

        // Close the scanner resource
        scanner.close();
    }
}
