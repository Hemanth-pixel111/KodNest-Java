
import java.util.Scanner;

// Define the Student class with id, name, and javaScore fields
class Student {

    int id;
    String name;
    int javaScore;
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner to take input from the standard input
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.javaScore = scanner.nextInt();

        // Print details of both students in the format: <id> - <name> - <javaScore>
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        // Compare scores and print the corresponding outcome message
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        } else if (s2.javaScore > s1.javaScore) {
            System.out.println(s2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }

        // Close the scanner resource
        scanner.close();
    }
}
