package W08TextProcessing;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];

            for (int j = 0; j < currentWord.length(); j++) {
                sb.append(currentWord);
            }


        }

        System.out.println(sb.toString());


    }
}
