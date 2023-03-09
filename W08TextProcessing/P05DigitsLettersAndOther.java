package W08TextProcessing;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();


        for (char symbol : input.toCharArray()) {

            if (Character.isDigit(symbol)) {
                digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letter.append(symbol);
            } else {
                other.append(symbol);
            }


        }

        System.out.println(digit.toString());
        System.out.println(letter.toString());
        System.out.println(other.toString());


    }
}
