
import java.util.Scanner;

class MethodDemo {

    // Method 1: No parameters, no return type
    void sayHello() {
        System.out.println("Hello from a method!");
    }

    // Method 2: Takes a parameter, no return type
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: No parameters, returns an integer
    int getLuckyNumber() {
        return 7;
    }

    // Method 4: Takes two integer parameters, returns their sum
    int add(int first, int second) {
        return first + second;
    }
}

public class Main {

    public static void main(String[] args) {
        // Initialize scanner to read inputs without prompt text
        Scanner scanner = new Scanner(System.in);

        // 1. Read a name
        String name = scanner.nextLine();

        // 2. Read two integers
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // 3. Create one MethodDemo object
        MethodDemo demo = new MethodDemo();

        // 4. Call all four methods
        demo.sayHello();
        demo.greet(name);
        int luckyNumber = demo.getLuckyNumber();
        int sum = demo.add(first, second);

        // 5. Print the returned lucky number and sum
        System.out.println("Lucky Number: " + luckyNumber);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
