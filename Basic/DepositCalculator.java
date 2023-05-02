import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double interestRate = interest / 100;
        Double finalSum = sum + months * ((sum * interestRate) / 12);
        System.out.println(finalSum);

    }
}
