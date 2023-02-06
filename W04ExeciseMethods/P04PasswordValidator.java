package W04ExeciseMethods;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

        boolean countResult = isValidCharactersCount(inputPassword);
        if (!countResult) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean validContains = isConsistsLettersAndDigits(inputPassword);
        if (!validContains) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean validDigitCount = isHaveAtLeastTwoDigits(inputPassword);
        if (!validDigitCount) {
            System.out.println("Password must have at least 2 digits");
        }

        if (countResult && validContains && validDigitCount) {
            System.out.println("Password is valid");
        }

    }

    public static boolean isValidCharactersCount(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isConsistsLettersAndDigits(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHaveAtLeastTwoDigits(String password) {
        int digitCount = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }


        }
        if (digitCount >= 2) {
            return true;
        } else {
            return false;
        }

    }


}
