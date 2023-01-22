package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        int sumOfChars = 0;

        for (int i = 1; i <= num ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int numOfSymbol = symbol;
            sumOfChars = sumOfChars + numOfSymbol;

        }
        System.out.printf("The sum equals: %d", sumOfChars);
    }

}
