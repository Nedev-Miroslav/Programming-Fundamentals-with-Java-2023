package W04ExeciseMethods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")) {
            isPalindrome(inputLine);


            inputLine = scanner.nextLine();
        }


    }

    public static void isPalindrome(String input) {
        String reversInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            reversInput += symbol;


        }
        if (input.equals(reversInput)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }


}
