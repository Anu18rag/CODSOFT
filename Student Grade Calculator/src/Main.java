import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];

        //To getting marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        //For calculating total marks and average percentage
        int totalMarks = Marks.calculateTotalMarks(marks);
        double averagePercentage = Marks.calculateAveragePercentage(totalMarks, numberOfSubjects);

        // Calculate grade
        String grade = Grade.calculateGrade(averagePercentage);

        // Display results
        Result.showResult(totalMarks, averagePercentage, grade);

        scanner.close();
    }
}
