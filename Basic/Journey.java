import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type = "";
        double sum = 0.0;

        if (budget <= 100) {
            if (season.equals("summer")){
                destination = "Bulgaria";
                type = "Camp";
                sum = budget * 0.30;
                } else if (season.equals("winter")) {
                destination = "Bulgaria";
                type = "Hotel";
                sum = budget * 0.70;
            }

        } else if (budget <= 1000) {
            if (season.equals("summer")){
                destination = "Balkans";
                type = "Camp";
                sum = budget * 0.40;
            } else if (season.equals("winter")) {
                destination = "Balkans";
                type = "Hotel";
                sum = budget * 0.80;
            }

        } else if (budget > 1000) {
            if (season.equals("summer")){
                destination = "Europe";
                type = "Hotel";
                sum = budget * 0.90;
            } else if (season.equals("winter")) {
                destination = "Europe";
                type = "Hotel";
                sum = budget * 0.90;
            }
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", type, sum);


    }
}
