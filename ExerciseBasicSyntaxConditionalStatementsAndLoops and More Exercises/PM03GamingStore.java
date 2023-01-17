package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PM03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double spendSum = 0.0;

        while (!command.equals("Game Time")) {

            if (command.equals("OutFall 4")) {
                if (balance >= 39.99) {
                    balance = balance - 39.99;
                    spendSum = spendSum + 39.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                }
            } else if (command.equals("CS: OG")) {
                if (balance >= 15.99) {
                    balance = balance - 15.99;
                    spendSum = spendSum + 15.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }


            } else if (command.equals("Zplinter Zell")) {
                if (balance >= 19.99) {
                    balance = balance - 19.99;
                    spendSum = spendSum + 19.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }

            } else if (command.equals("Honored 2")) {
                if (balance >= 59.99) {
                    balance = balance - 59.99;
                    spendSum = spendSum + 59.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (command.equals("RoverWatch")) {
                if (balance >= 29.99) {
                    balance = balance - 29.99;
                    spendSum = spendSum + 29.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else if (command.equals("RoverWatch Origins Edition")) {
                if (balance >= 39.99) {
                    balance = balance - 39.99;
                    spendSum = spendSum + 39.99;
                    System.out.printf("Bought %s%n", command);
                } else {
                    System.out.println("Too Expensive");
                }
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    break;
                }
            } else {
                System.out.println("Not Found");
            }


            command = scanner.nextLine();
        }


        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendSum, balance);
        }


    }
}
