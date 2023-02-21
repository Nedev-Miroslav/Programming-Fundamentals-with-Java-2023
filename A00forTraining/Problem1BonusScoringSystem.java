package A00forTraining;

import java.util.Scanner;

public class Problem1BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        int countLecture = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double max = Double.MIN_VALUE;
        int lecture = 0;
        for (int i = 1; i <= studentCount; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (1.0 * studentAttendance / countLecture) * (5 + additionalBonus);
            if (totalBonus > max) {
                max = totalBonus;
                lecture = studentAttendance;
            }


        }
        double finalMax = Math.round(max);

        System.out.printf("Max Bonus: %.0f.%n", finalMax);
        System.out.printf("The student has attended %d lectures.%n", lecture);


    }
}
