package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String enterPassword = scanner.nextLine();
        String password = "";
        int counter = 0;


        for (int i = userName.length() - 1; i >= 0; i--) {
            char symbol = userName.charAt(i);
            password = password + symbol;

        }

        while (!enterPassword.equals(password)) {
            counter++;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enterPassword = scanner.nextLine();
        }
        if (enterPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
