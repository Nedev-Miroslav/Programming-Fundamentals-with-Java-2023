package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PM04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reversWord = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            char symbol = word.charAt(i);
            reversWord = reversWord + symbol;
        }
        System.out.println(reversWord);
    }
}
