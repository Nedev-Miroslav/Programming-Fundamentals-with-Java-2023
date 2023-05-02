import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoe = tax - 0.4 * tax;
        double equip = shoe - 0.2 * shoe;
        double ball = equip / 4;
        double accessory = ball / 5;
        double total = tax + shoe + equip + ball + accessory;
        System.out.println(total);



    }
}
