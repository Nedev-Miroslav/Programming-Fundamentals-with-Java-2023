
import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegy = Integer.parseInt(scanner.nextLine());
        double coutChicken = chicken * 10.35;
        double coutFish = fish * 12.40;
        double coutVegy = vegy * 8.15;
        double delivery = 2.5;
        double totalPrice = coutChicken + coutFish + coutVegy;
        double desert = totalPrice * 0.2;
        double finalPrice = totalPrice + desert + delivery;
        System.out.println(finalPrice);
        }


    }

