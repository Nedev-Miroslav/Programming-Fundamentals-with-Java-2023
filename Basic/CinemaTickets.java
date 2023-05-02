import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // команда ИЛИ филм

        int allCountTickets = 0; // брой на ВСИЧКИ билети
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeat = Integer.parseInt(scanner.nextLine()); // за свободните места в салона

            int countTickets = 0; // брой билети за КОНКРЕТЕН филм

            String command = scanner.nextLine(); // ИЛИ тип билет, ИЛИ команда
            while (!command.equals("End")) {
                String typeTicket = command;

                allCountTickets++; // всички билети + 1
                countTickets++; // билети за конкретен филм + 1

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (freeSeat == countTickets) { // ако свободните места са равни на билети за конректния филм, то прекъсни вътрешния while
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countTickets * 100.0 / freeSeat);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 100.0 / allCountTickets);
    }
}



