package A00forTraining;

import java.util.Scanner;

public class Problem1SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int sumNum = num1 + num2 + num3;
        int hour = 0;
        while (studentCount > 0) {
            studentCount -= sumNum;
            hour++;
            if (hour % 4 == 0) {
                hour++;
            }


        }


        System.out.printf("Time needed: %dh.", hour);


    }
}
