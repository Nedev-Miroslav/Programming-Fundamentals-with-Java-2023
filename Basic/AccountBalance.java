import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String installment = scanner.nextLine();
        double sum = 0.0;


        while (!installment.equals("NoMoreMoney")) {
            double balance = Double.parseDouble(installment);
            if (balance < 0) {
                System.out.println("Invalid operation!");
                break;


            }
            sum = sum + balance;
            System.out.printf("Increase: %.2f%n", balance);
            installment = scanner.nextLine();


        }
        System.out.printf("Total: %.2f", sum);


    }
}
