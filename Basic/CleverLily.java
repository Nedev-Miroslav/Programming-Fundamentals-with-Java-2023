import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrices = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int sum = 0;
        int toy = 0;
        double totalSum = 0.0;


        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                firstSum = firstSum + 10;
                sum = sum + firstSum - 1;

            } else {
                toy = toy + 1;
            }


        }  totalSum = toyPrices * toy + sum;

        if (totalSum >= washingMachine) {
            System.out.printf("Yes! %.2f", totalSum - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - totalSum);
        }


    }
}
