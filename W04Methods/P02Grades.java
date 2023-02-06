package W04Methods;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);


    }

    public static void printGrade(double gradeChecker) {
        String gradeName = "";
        if (gradeChecker >= 2.00 && gradeChecker <= 2.99) {
            gradeName = "Fail";
        } else if (gradeChecker <= 3.49) {
            gradeName = "Poor";
        } else if (gradeChecker <= 4.49) {
            gradeName = "Good";
        } else if (gradeChecker <= 5.49) {
            gradeName = "Very good";
        } else if (gradeChecker <= 6) {
            gradeName = "Excellent";
        }
        System.out.println(gradeName);

    }

}
