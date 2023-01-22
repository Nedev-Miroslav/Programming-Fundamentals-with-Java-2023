package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            char first = (char) ('a' + i);

            for (int j = 0; j < num; j++) {
                char second = (char) ('a' + j);

                for (int k = 0; k < num; k++) {
                    char third = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", first, second, third);
                }


            }

        }


    }
}
