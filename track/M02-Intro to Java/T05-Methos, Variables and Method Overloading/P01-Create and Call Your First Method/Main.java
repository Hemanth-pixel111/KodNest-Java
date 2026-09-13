// Define the Robot class

class Robot {

    // Method that prints the robot's superpower message
    void speak() {
        System.out.println("Beep beep! Java is my superpower!");
    }
}

// Main execution class
public class Main {

    public static void main(String[] args) {
        // Step 1: Create an instance of the Robot class
        Robot rb = new Robot();

        // Step 2: Call the speak() method on the created object
        rb.speak();
    }
}
