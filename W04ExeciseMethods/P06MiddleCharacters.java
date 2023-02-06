package W04ExeciseMethods;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        printMiddleChars(inputLine);


    }

    public static void printMiddleChars(String input) {
        if (input.length() % 2 != 0) {
            char symbol = input.charAt(input.length() / 2);
            System.out.println(symbol);
        } else {
            char symbol1 = input.charAt(input.length() / 2 - 1);
            char symbol2 = input.charAt(input.length() / 2);
            System.out.printf("%c%c%n", symbol1, symbol2);
        }


    }


}
