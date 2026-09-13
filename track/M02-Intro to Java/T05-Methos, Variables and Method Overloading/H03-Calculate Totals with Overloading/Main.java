
import java.util.Scanner;

// Define the ResultCalculator class with overloaded getTotal methods
class ResultCalculator {

    // Method to calculate and return the total of two marks
    int getTotal(int first, int second) {
        return first + second;
    }

    // Overloaded method to calculate and return the total of three marks
    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner for reading standard input
        Scanner scanner = new Scanner(System.in);

        // Read the three marks without input prompts
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create an instance of ResultCalculator
        ResultCalculator calculator = new ResultCalculator();

        // Call the two-parameter method using the first two marks
        int twoMarkTotal = calculator.getTotal(first, second);

        // Call the three-parameter method using all three marks
        int threeMarkTotal = calculator.getTotal(first, second, third);

        // Print the calculated totals formatted as required
        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);

        // Close the scanner resource
        scanner.close();
    }
}
