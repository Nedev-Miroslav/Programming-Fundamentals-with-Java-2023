import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("End")) {
            String destination = input;
            double tripPrice = Double.parseDouble(scanner.nextLine());
            double savedSum = 0;
            while (savedSum < tripPrice) {
                double amount = Double.parseDouble(scanner.nextLine());
                savedSum = savedSum + amount;
            }

            System.out.printf("Going to %s!%n", destination);


            input = scanner.nextLine();
        }


    }
}
