
import java.util.Scanner;

class StudentUtility {

    // Prints the header title for the report
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    // Prints the student's ID and full name
    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Returns the benchmark passing threshold
    double getPassingPercentage() {
        return 60.0;
    }

    // Computes and returns the average of the two test scores
    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Single StudentUtility object used for all custom operations
        StudentUtility utility = new StudentUtility();

        // 1. Read Student ID
        int id = scanner.nextInt();

        // Consume leftover newline before reading the full name string
        scanner.nextLine();

        // 2. Read Full name (preserving spaces)
        String name = scanner.nextLine();

        // 3. Read Java score
        int javaScore = scanner.nextInt();

        // 4. Read SQL score
        int sqlScore = scanner.nextInt();

        // Display report header and student credentials
        utility.showReportTitle();
        utility.displayStudent(id, name);

        // Fetch percentage calculation and benchmark percentage
        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();

        // Print final computed percentage
        System.out.println("Percentage: " + percentage);

        // Make and print final evaluation decision in main()
        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}
