package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYield = Integer.parseInt(scanner.nextLine());
        int profit = 0;
        int countDays = 0;


        while (startYield >= 100) {
            countDays++;
            profit = profit + startYield;

            profit = profit - 26;


            startYield = startYield - 10;
        }
        if (profit >= 26) {
            profit = profit - 26;
        }
        System.out.println(countDays);
        System.out.println(profit);


    }
}
