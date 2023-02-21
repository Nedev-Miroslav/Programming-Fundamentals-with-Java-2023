package A00MidExamPreparation;

import java.util.Scanner;

public class Second01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double gainPlunder = 0.0;
        for (int i = 1; i <= days; i++) {

            gainPlunder += plunderPerDay;

            if (i % 3 == 0) {
                gainPlunder += plunderPerDay * 0.5;
            }

            if (i % 5 == 0) {
                gainPlunder = gainPlunder * 0.7;

            }


        }
        if (gainPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gainPlunder);

        } else {
            double result = gainPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", result);
        }


    }
}
