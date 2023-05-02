import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int tedy = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double sumSum = puzzle * 2.6 + doll * 3 + tedy * 4.1 + minion * 8.2 + truck * 2;
        int sumToy = puzzle + doll + tedy + minion + truck;
        if (sumToy >= 50) {
            double discout = sumSum * 0.75;
            total = discout * 0.9;
        } else {
            total = sumSum * 0.9;
        }
        if (total >= vacation) {
            double endSum = total - vacation;
            System.out.printf("Yes! %.2f lv left.", endSum);
        } else {
            double endSum = vacation - total;
            System.out.printf("Not enough money! %.2f lv needed.", endSum);

        }


    }

}
