package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length() - 1; i++) {
            char current = sb.charAt(i);
            char next = sb.charAt(i + 1);

            if (current == next) {
                sb.deleteCharAt(i + 1);
                i--;
            }

        }
        System.out.println(sb);


    }
}
