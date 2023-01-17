package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0.0;


        if (typeOfTheGroup.equals("Students")) {
            if (dayOfTheWeek.equals("Friday")) {
                price = 8.45;
            } else if (dayOfTheWeek.equals("Saturday")) {
                price = 9.80;
            } else if (dayOfTheWeek.equals("Sunday")) {
                price = 10.46;
            }


        } else if (typeOfTheGroup.equals("Business")) {
            if (dayOfTheWeek.equals("Friday")) {
                price = 10.90;
            } else if (dayOfTheWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfTheWeek.equals("Sunday")) {
                price = 16;
            }


        } else if (typeOfTheGroup.equals("Regular")) {
            if (dayOfTheWeek.equals("Friday")) {
                price = 15;
            } else if (dayOfTheWeek.equals("Saturday")) {
                price = 20;
            } else if (dayOfTheWeek.equals("Sunday")) {
                price = 22.50;
            }


        }
        double finalSum = price * countGroup;

        if (typeOfTheGroup.equals("Students") && countGroup >= 30) {
            finalSum = finalSum * 0.85;
        }
        if (typeOfTheGroup.equals("Business") && countGroup >= 100) {
            finalSum = finalSum - (price * 10);
        }
        if (typeOfTheGroup.equals("Regular") && countGroup >= 10 && countGroup <= 20) {
            finalSum = finalSum * 0.95;
        }


        System.out.printf("Total price: %.2f", finalSum);


    }
}
