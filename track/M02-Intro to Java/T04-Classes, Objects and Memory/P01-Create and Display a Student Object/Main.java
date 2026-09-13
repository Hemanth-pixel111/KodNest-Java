
import java.util.Scanner;

// Define the Student class with the required fields
class Student {

    int id;
    String name;
    String course;
    double javaScore;
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Create a new Student object instance
        Student s1 = new Student();

        // Read and assign input values to the student's fields in the required order
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.course = scanner.next();
        s1.javaScore = scanner.nextDouble();

        // Display the formatted student profile
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

        // Close the scanner resource
        scanner.close();
    }
}
