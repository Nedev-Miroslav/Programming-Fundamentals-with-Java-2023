package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sum = 0;

        while (num > 0) {
            int factOfNum = 1;
            int lastNum = num % 10;
            for (int i = 1; i <= lastNum; i++) {
                factOfNum = factOfNum * i;

            }


            sum = sum + factOfNum;
            num = num / 10;

        }

        if (startNum == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }

}
