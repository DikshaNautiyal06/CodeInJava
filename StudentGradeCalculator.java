import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSub;
        int totMarks = 0;
        double averagePercentage;
        char grade;

        System.out.print("Enter  total number of subjects: ");
        totalSub = scanner.nextInt();

    
        for (int i = 1; i <= totalSub; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totMarks += marks;
        }

        averagePercentage = (double) totMarks / (totalSub * 100) * 100;

    
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("Total Marks: " + totMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}