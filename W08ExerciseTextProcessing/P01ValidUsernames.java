package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");

        for (String word : inputArr) {

            if (isValidPassword(word)) {
                System.out.println(word);
            }

        }

    }

    private static boolean isValidPassword(String word) {

        if (word.length() < 3 || word.length() > 16) {
            return false;

        }


        for (char symbol : word.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;

            }

        }
        return true;

    }
}
