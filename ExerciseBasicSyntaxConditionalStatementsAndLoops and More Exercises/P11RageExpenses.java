package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        for (int i = 1; i <= lostGame; i++) {
            if (i % 2 == 0) {
                headsetCount++;
            }
            if (i % 3 == 0) {
                mouseCount++;
            }
            if (i % 6 == 0) {
                keyboardCount++;
            }
            if (i % 12 == 0) {
                displayCount++;
            }
        }


        double totalSum = headsetPrice * headsetCount + mouseCount * mousePrice + keyboardCount * keyboardPrice + displayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);


    }
}
