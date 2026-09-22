
import java.util.Scanner;

class Product {

    // Instance variables to store product details
    String name;
    double price;

    // Parameterized constructor to initialize instance variables
    Product(String name, double price) {
        // Store the received name in the instance variable using this
        this.name = name;
        // Store the received price in the instance variable using this
        this.price = price;
    }

    // Method to display product information
    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner object to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Read the product name
        String name = scanner.nextLine();
        // Read the product price
        double price = scanner.nextDouble();

        // Create a Product object with the input values
        Product product = new Product(name, price);

        // Call display method to print the details
        product.display();

        // Close the scanner resource
        scanner.close();
    }
}
