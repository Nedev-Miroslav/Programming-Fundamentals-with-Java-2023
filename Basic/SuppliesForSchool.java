import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discout = Integer.parseInt(scanner.nextLine());

        double pricePen = pens * 5.8;
        double priceMarker = markers * 7.2;
        double priceLiterus = liters * 1.2;

        double totalPrice = pricePen + priceMarker + priceLiterus;
        double finalPrice = totalPrice - totalPrice * (discout / 100.0);
        System.out.println(finalPrice);


    }
}
