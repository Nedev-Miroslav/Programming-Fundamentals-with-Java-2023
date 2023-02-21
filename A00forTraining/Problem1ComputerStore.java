package A00forTraining;

import java.util.Scanner;

public class Problem1ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();



        double sumWithoutTax = 0;
        while (!(input.equals("special") || input.equals("regular"))) {
            double price = Double.parseDouble(input);
            if(price > 0) {
                sumWithoutTax += price;
            } else if (price < 0) {
                System.out.println("Invalid price!");
            }



            input = scanner.nextLine();
        }

        double tax = sumWithoutTax * 0.2;
        double toral = tax + sumWithoutTax;
        String currentClient = input;
        if (sumWithoutTax == 0){
            System.out.println("Invalid order!");
            return;
        }


        if(currentClient.equals("special")){
            double finalPrice = toral * 0.9;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$%n",tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalPrice);

        } else  {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$%n",tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", toral);
        }


    }
}
