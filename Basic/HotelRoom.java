import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int sleepover = Integer.parseInt(scanner.nextLine());
        double apartment = 0;
        double studio = 0;


        switch (month) {
            case "May":
            case "October":
                if (sleepover > 14) {
                    apartment = sleepover * 65 * 0.90;
                } else {
                    apartment = sleepover * 65;
                }
                if (sleepover > 14) {
                    studio = sleepover * 50 * 0.70;
                } else if (sleepover > 7) {
                    studio = sleepover * 50 * 0.95;
                } else studio = sleepover * 50;


                break;
            case "June":
            case "September":
                if (sleepover > 14) {
                    apartment = sleepover * 68.70 * 0.90;
                } else {
                    apartment = sleepover * 68.70;
                }

                if (sleepover > 14) {
                    studio = sleepover * 75.20 * 0.80;
                } else {
                    studio = sleepover * 75.20;
                }


                break;
            case "July":
            case "August":
                if (sleepover > 14) {
                    apartment = sleepover * 77 * 0.90;
                } else {
                    apartment = sleepover * 77;
                }

                studio = sleepover * 76;


        } System.out.printf("Apartment: %.2f lv. %n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);


    }
}
