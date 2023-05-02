import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String place = scanner.nextLine();

        double spendPercent = 0;
        double earnSum = 0;

        switch (place) {
            case "Bulgaria":
                if (seasons.equals("summer")) {
                    spendPercent = 0.95;
                } else if (seasons.equals("winter")) {
                    spendPercent = 0.92;
                }
                break;
            case "Abroad":
                if (seasons.equals("summer")) {
                    spendPercent = 0.9;
                } else if (seasons.equals("winter")) {
                    spendPercent = 0.85;
                }
            break;
        }
        if (place.equals("Bulgaria")) {
            earnSum = dancers * points * spendPercent;


        } else if (place.equals("Abroad")) {
            earnSum = dancers * points * spendPercent * 1.5;
        }

        double donte = earnSum * 0.75;
        double left = earnSum - donte;
        double leftForDancers = left / dancers;

        System.out.printf("Charity - %.2f%n", donte);
        System.out.printf("Money per dancer - %.2f%n", leftForDancers);


    }
}
