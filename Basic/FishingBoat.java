import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishMan = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;


        switch (season) {
            case "Spring":
                if (fishMan <= 6) {
                    rent = 3000 * 0.9;
                } else if (fishMan > 7 && fishMan <= 11) {
                    rent = 3000 * 0.85;
                } else if (fishMan > 11) {
                    rent = 3000 * 0.75;
                }
                break;
            case "Summer":
                if (fishMan <= 6) {
                    rent = 4200 * 0.9;
                } else if (fishMan > 7 && fishMan <= 11) {
                    rent = 4200 * 0.85;
                } else if (fishMan > 11) {
                    rent = 4200 * 0.75;
                }
                break;
            case "Autumn":
                if (fishMan <= 6) {
                    rent = 4200 * 0.9;
                } else if (fishMan > 7 && fishMan <= 11) {
                    rent = 4200 * 0.85;
                } else if (fishMan > 11) {
                    rent = 4200 * 0.75;
                }
                break;
            case "Winter":
                if (fishMan <= 6) {
                    rent = 2600 * 0.9;
                } else if (fishMan > 7 && fishMan <= 11) {
                    rent = 2600 * 0.85;
                } else if (fishMan > 11) {
                    rent = 2600 * 0.75;
                }


        }
        if (fishMan % 2 == 0 && (season.equals("Spring") || season.equals("Summer") || season.equals("Winter"))) {
        rent = rent * 0.95;
        } if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", rent- budget);
        }


    }
}
