
import java.util.Scanner;

// Define the Printer class with overloaded show methods
class Printer {

    // Method to display an integer number
    void show(int number) {
        // Print the number formatted as required
        System.out.println("Number: " + number);
    }

    // Overloaded method to display a String word
    void show(String word) {
        // Print the word formatted as required
        System.out.println("Word: " + word);
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner for reading standard input
        Scanner scanner = new Scanner(System.in);

        // Read one integer without prompting
        int number = scanner.nextInt();

        // Read one word without prompting
        String word = scanner.next();

        // Create an instance of the Printer class
        Printer printer = new Printer();

        // Call the overloaded show method with the integer argument
        printer.show(number);

        // Call the overloaded show method with the String argument
        printer.show(word);

        // Close the scanner resource
        scanner.close();
    }
}
