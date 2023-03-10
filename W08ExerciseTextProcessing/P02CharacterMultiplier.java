package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split("\\s+");

        String first = inputArr[0];
        String second = inputArr[1];


        int result = multiplicationOfChars(first, second);
        System.out.println(result);


    }

    private static int multiplicationOfChars(String first, String second) {
        int result = 0;
        int n = Math.min(first.length(), second.length());

        for (int i = 0; i < n; i++) {
            char firstSymbol = first.charAt(i);
            char secondSymbol = second.charAt(i);

            int currentMultiplication = firstSymbol * secondSymbol;
            result += currentMultiplication;

        }


        if (first.length() > second.length()) {
            for (int i = n; i < first.length(); i++) {
                int current = first.charAt(i);
                result += current;

            }
        } else if (second.length() > first.length()) {
            for (int i = n; i < second.length(); i++) {
                int current = second.charAt(i);
                result += current;
            }
        }
        return result;
    }
}
