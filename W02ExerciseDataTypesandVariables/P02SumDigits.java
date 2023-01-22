package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num > 0) {
            int currentDigit = num % 10;
            sum = sum + currentDigit;
            num = num / 10;

        }
        System.out.println(sum);

    }
}
