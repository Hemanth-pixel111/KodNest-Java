
import java.util.Scanner;

// Define the Learner class with the required fields
class Learner {

    int id;
    String name;
    int javaScore;
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner l1 = new Learner();
        l1.id = scanner.nextInt();
        l1.name = scanner.next();
        l1.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner l2 = new Learner();
        l2.id = scanner.nextInt();
        l2.name = scanner.next();
        l2.javaScore = scanner.nextInt();

        // Read the updated Java score for the first learner
        int newFirstScore = scanner.nextInt();

        // Display the learner details before the score update
        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        // Update the Java score of the first learner only
        l1.javaScore = newFirstScore;

        // Display the learner details after the update
        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        // Close the scanner resource
        scanner.close();
    }
}
