import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Subjects = 0;

        while (true) {
            System.out.print("Enter the number of subjects: ");
            if (scanner.hasNextInt()) {
                Subjects = scanner.nextInt();
                if (Subjects > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        int totalMarks = 0;
        for (int i = 0; i <  Subjects; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int marks = scanner.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        totalMarks += marks;
                        break;
                    } else {
                        System.out.println("Please enter marks between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); 
                }
            }
        }

        double averagePercentage = (double) totalMarks / Subjects;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
