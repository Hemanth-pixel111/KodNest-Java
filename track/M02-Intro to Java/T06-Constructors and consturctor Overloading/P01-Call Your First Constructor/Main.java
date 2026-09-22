
class Robot {

    // No-argument constructor
    Robot() {
        // Print the required message upon object creation
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }
}

public class Main {

    public static void main(String[] args) {
        // Create one Robot object (invokes the constructor automatically)
        Robot r = new Robot();
    }
}
