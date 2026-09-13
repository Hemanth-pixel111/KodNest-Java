
import java.util.Scanner;

// Define the Student class with required fields
class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create and populate the first Student object
        Student firstStudent = new Student();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // 2. Create and populate the second Student object
        Student secondStudent = new Student();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // 3. Read the ID to search for and the new attendance percentage
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // 4. Reference variable to point to the matching student (without creating a third Student object)
        Student selectedStudent = null;

        // Check if either student matches the entered registration ID
        if (selectedId == firstStudent.registrationId) {
            selectedStudent = firstStudent;
        } else if (selectedId == secondStudent.registrationId) {
            selectedStudent = secondStudent;
        }

        // 5. Update attendance if found, otherwise report that the student was not found
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // 6. Print the records of both students
        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");

        scanner.close();
    }
}
