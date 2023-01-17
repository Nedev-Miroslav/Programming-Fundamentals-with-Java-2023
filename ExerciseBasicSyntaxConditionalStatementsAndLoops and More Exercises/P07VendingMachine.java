package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumOfCoin = 0.0;


        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sumOfCoin = sumOfCoin + coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            command = scanner.nextLine();

        }

        String product = scanner.nextLine();

        while(!product.equals("End")) {
            boolean hasMoney = true;
            switch(product) {
                case "Nuts":
                    if(sumOfCoin < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sumOfCoin -= 2;
                    }
                    break;
                case "Water":
                    if(sumOfCoin < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sumOfCoin -= 0.7;
                    }
                    break;
                case "Crisps":
                    if(sumOfCoin < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sumOfCoin -= 1.5;
                    }
                    break;
                case "Soda":
                    if(sumOfCoin < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sumOfCoin -= 0.8;
                    }
                    break;
                case "Coke":
                    if(sumOfCoin < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sumOfCoin -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if(!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sumOfCoin);
    }
}