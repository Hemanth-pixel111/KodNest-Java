
public class Main {

    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        boolean isReady = marks >= 60 && attendance >= 75;
        String status = isReady ? "Placement Ready" : "Continue Preparation";

        System.out.println(status);

        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}
