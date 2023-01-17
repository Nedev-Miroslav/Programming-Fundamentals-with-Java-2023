package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.printf("%d ", firstNum);
            sumNum = sumNum + firstNum;
            firstNum = firstNum + 1;

        }
        System.out.printf("%nSum: %d", sumNum);


    }
}
