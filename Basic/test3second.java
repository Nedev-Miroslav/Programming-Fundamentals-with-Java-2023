import java.util.Scanner;

public class test3second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double sum = 0;

        switch (symbol) {
            case 'm':
                if (sport.equals("Gym")) {
                    sum = 42;
                } else if (sport.equals("Boxing")) {
                    sum = 41;
                } else if (sport.equals("Yoga")){
                    sum = 45;
                } else if (sport.equals("Zumba")){
                    sum = 34;
                }else if (sport.equals("Dances")){
                    sum = 51;
                }else if (sport.equals("Pilates")){
                    sum = 39;
                }
                break;
            case 'f':
                if (sport.equals("Gym")) {
                    sum = 35;
                } else if (sport.equals("Boxing")) {
                    sum = 37;
                } else if (sport.equals("Yoga")){
                    sum = 42;
                } else if (sport.equals("Zumba")){
                    sum = 31;
                }else if (sport.equals("Dances")){
                    sum = 53;
                }else if (sport.equals("Pilates")){
                    sum = 37;
                }
                break;

        } if (age <= 19) {
            sum = sum - sum * 20 /100;
        }
        if (sum <= budget) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", sum - budget);
        }



    }
}
