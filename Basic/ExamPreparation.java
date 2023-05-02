import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availablePoorGrade = Integer.parseInt(scanner.nextLine());
        String exercise = scanner.nextLine();
        int poorGradeCount = 0;
        int allGrades = 0;
        int sumGrade = 0;
        String lastExercise = "";

        while (!exercise.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            allGrades++;
            sumGrade = sumGrade + grade;

            if (grade <= 4) {
                poorGradeCount++;
            }
            if (poorGradeCount >= availablePoorGrade) {
                System.out.printf("You need a break, %d poor grades.", poorGradeCount);
                break;
            }
            lastExercise = exercise;
            exercise = scanner.nextLine();
        }
        if (exercise.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", sumGrade * 1.0 / allGrades);
            System.out.printf("Number of problems: %d%n", allGrades);
            System.out.printf("Last problem: %s", lastExercise);

        }

    }
}
