package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            char current = sb.charAt(i);
            if (strength > 0 && current != '>') {
                sb.deleteCharAt(i);
                strength--;
                i--;


            } else if (current == '>') {
                int power = Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
                strength += power;
            }


        }

        System.out.println(sb);


    }
}
