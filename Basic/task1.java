import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCart = Integer.parseInt(scanner.nextLine());
        int museumTicket = Integer.parseInt(scanner.nextLine());


        double nightPrice = 20 * nights;
        double transportPrice = 1.60 * transportCart;
        double museumPrice = 6 * museumTicket;

        double sum = nightPrice + transportPrice + museumPrice;
        double totalSum = sum * people;
        double finalSum = totalSum * 1.25;

        System.out.printf("%.2f", finalSum);








    }
}
