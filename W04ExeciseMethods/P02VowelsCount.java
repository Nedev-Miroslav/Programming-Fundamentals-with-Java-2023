package W04ExeciseMethods;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        printVowelsCount(inputLine);


    }

    public static void printVowelsCount(String input) {
        int counter = 0;
        for (char symbol : input.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                counter++;
            }

        }
        System.out.println(counter);

    }


}
