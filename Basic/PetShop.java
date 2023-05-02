import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double price1 = 2.5;
        double price2 = 4;

        double dogPrice = dogFood * price1;
        double carPrice = catFood * price2;

        double total = dogPrice + carPrice;

        System.out.println(total + " lv." );

    }

}
