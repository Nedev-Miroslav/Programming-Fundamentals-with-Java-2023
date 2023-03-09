package W08TextProcessing;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder();

            for (int i = input.length() - 1 ; i >= 0 ; i--) {
               char currentLetter = input.charAt(i);
                        sb.append(currentLetter);
            }


            System.out.println(input + " = " + sb.toString());

            input = scanner.nextLine();
        }


    }
}
