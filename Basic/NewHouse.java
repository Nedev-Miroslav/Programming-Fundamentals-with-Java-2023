import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String floverType = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        switch (floverType) {
            case "Roses":
                if (count > 80) {
                    sum = (count * 5.00) * 0.90;
                } else {
                    sum = count * 5.00;
                }
                break;
            case "Dahlias":
                if (count > 90) {
                    sum = (count * 3.80) * 0.85;
                } else {
                    sum = count * 3.80;
                }
                break;
            case "Tulips":
                if (count > 80) {
                    sum = (count * 2.80) * 0.85;
                } else {
                    sum = (count * 2.80);
                }
                break;
            case "Narcissus":
                if (count < 120) {
                    sum = (count * 3) * 1.15;
                } else {
                    sum = count * 3;
                }
                break;
            case "Gladiolus":
                if (count < 80) {
                    sum = (count * 2.5) * 1.20;
                } else {
                    sum = count * 2.5;
                }
                break;

        }
        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, floverType, budget - sum);
        } else
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);

    }
}
