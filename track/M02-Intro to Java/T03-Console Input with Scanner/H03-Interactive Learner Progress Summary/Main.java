
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int days = scanner.nextInt();
        int totalSolved = 0;

        for (int i = 0; i < days; i++) {
            totalSolved += scanner.nextInt();
        }

        double dailyAverage = (double) totalSolved / days;
        String status = (dailyAverage >= 5.0) ? "Consistent" : "Needs consistency";

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
