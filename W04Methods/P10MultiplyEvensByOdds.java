package W04Methods;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        System.out.println(getMultiplyOfOddAndEvenDigits(n));


    }

    public static int getMultiplyOfOddAndEvenDigits(int num) {
        int evenNum = 0;
        int oddNum = 0;
        while (num != 0) {
            int currentDigit = num % 10;
            if (currentDigit % 2 == 0) {
                evenNum += currentDigit;
            } else {
                oddNum += currentDigit;
            }
            num = num / 10;


        }

        return evenNum * oddNum;


    }

}
