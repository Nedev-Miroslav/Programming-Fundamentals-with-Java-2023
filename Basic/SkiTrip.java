import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int nights = days - 1;
        double sum = 0.0;
        double finalSum = 0.0;

        switch (room) {
            case "room for one person":
                sum = nights * 18.0;
                break;
            case "apartment":
                if (days < 10) {
                    sum = nights * 25.00 * 0.70;
                } else if (days > 10 && days <= 15) {
                    sum = nights * 25.00 * 0.65;
                } else  {
                    sum = nights * 25.00 * 0.50;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    sum = nights * 35.00 * 0.90;
                } else if (days > 10 && days <= 15) {
                    sum = nights * 35.00 * 0.85;
                } else  {
                    sum = nights * 35.00 * 0.80;
                }
                break;
        } if (evaluation.equals("positive")) {
            finalSum = sum * 1.25;
        } else if (evaluation.equals("negative")) {
            finalSum = sum * 0.90;
        }
        System.out.printf("%.2f", finalSum);
    }
}
