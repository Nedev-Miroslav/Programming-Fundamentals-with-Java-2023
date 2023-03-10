package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char symbol : input.toCharArray()) {


            sb.append(encryptedMethod(symbol));


        }

        System.out.println(sb);


    }

    private static char encryptedMethod(char symbol) {
        char encryptedSymbol = (char) (symbol + 3);
        return encryptedSymbol;
    }
}
