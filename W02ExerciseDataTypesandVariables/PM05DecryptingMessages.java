package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class PM05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int countOfLetters = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = 0; i < countOfLetters; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int addKey = (int) symbol + key;
            char finalLetter = (char) addKey;
            result = result + finalLetter;
        }
        System.out.println(result);


    }
}